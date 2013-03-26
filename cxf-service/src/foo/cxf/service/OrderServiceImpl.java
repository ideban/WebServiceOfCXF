package foo.cxf.service;

import javax.jws.WebService;

import foo.cxf.bean.ApplicationResponse;
import foo.cxf.bean.Order;
import foo.cxf.dao.OrderDAO;

/**
 * 对外开放的接口实现类，同样需要@WebService注解,如果该类同时实现了其他接口，则必须加上endpointInterface参数指定接口
 * 
 * @author 路飞
 * 
 */
@WebService(endpointInterface = "foo.cxf.service.OrderService")
public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO;

	public ApplicationResponse processOrder(Order order) {

		ApplicationResponse response = new ApplicationResponse();

		if (order != null && order.getName() != null
				&& order.getPrice() != null
				&& (Integer) order.getAmount() != null) {
			
			order = orderDAO.processOrder(order);
			
			if (order.getTotal() != null) {
				response.setFlag(1);
				response.setOrder(order);

				StringBuilder sb = new StringBuilder();
				sb.append("Your order: ").append(order.getName()).append(" * ")
						.append(order.getAmount()).append("\n");
				sb.append("Total money is ").append(order.getTotal());
				response.setMessage(sb.toString());
			} else {
				response.setFlag(0);
				response.setOrder(order);
				response.setMessage("计算失败");
			}
		} else {
			response.setFlag(0);
			response.setOrder(order);
			response.setMessage("订单信息不全");
		}

		return response;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

}
