package bar.cxf.client;

import bar.cxf.client.wsdl.ApplicationResponse;
import bar.cxf.client.wsdl.Order;
import bar.cxf.client.wsdl.OrderService;

/**
 * 测试调用webservice服务
 * 
 * @author 路飞
 * 
 */
public class TestService {

	private OrderService client;

	public OrderService getClient() {
		return client;
	}

	public void setClient(OrderService client) {
		this.client = client;
	}

	public ApplicationResponse test(Order order) {
		return client.processOrder(order);
	}

}
