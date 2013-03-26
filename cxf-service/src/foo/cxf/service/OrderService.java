package foo.cxf.service;

import javax.jws.WebService;

import foo.cxf.bean.ApplicationResponse;
import foo.cxf.bean.Order;

/**
 * 通过@WebService注解定义成对外开放的订单处理接口
 * 
 * @author 路飞
 * 
 */
@WebService
public interface OrderService {

	/**
	 * 处理订单并返回结果
	 * 
	 * @param order
	 * @return
	 */
	public ApplicationResponse processOrder(Order order);
}
