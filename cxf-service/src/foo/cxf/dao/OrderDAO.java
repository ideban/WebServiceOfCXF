package foo.cxf.dao;

import foo.cxf.bean.Order;

/**
 * 订单处理接口
 * 
 * @author 路飞
 *
 */
public interface OrderDAO {
	
	/**
	 * 处理订单
	 * @param order
	 * @return
	 */
	public Order processOrder(Order order);

}
