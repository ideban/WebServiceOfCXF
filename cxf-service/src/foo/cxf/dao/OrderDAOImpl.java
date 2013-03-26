package foo.cxf.dao;

import java.math.BigDecimal;

import foo.cxf.bean.Order;

/**
 * 订单处理实现类
 * 
 * @author 路飞
 * 
 */
public class OrderDAOImpl implements OrderDAO {

	public Order processOrder(Order order) {
		
		BigDecimal total = order.getPrice().multiply(new BigDecimal(order.getAmount()));
		
		order.setTotal(total);

		return order;
	}

}
