package bar.cxf.client;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bar.cxf.client.wsdl.ApplicationResponse;
import bar.cxf.client.wsdl.Order;

/**
 * 访问WebService接口
 * 
 * @author 路飞
 * 
 */
public class TestCase {

	public static void main(String[] args) {
		
		/*
		 * cxf
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "client-beans.xml" });

		TestService test = (TestService)context.getBean("testService");

		Order order = new Order();
		order.setName("Intel i5 2500");
		order.setAmount(5);
		order.setPrice(new BigDecimal(1439.00));

		ApplicationResponse response = test.test(order);

		if(response != null && response.getFlag() == 1){
			System.out.println(response.getMessage());
		}else if(response != null && response.getFlag() == 0){
			System.out.println(response.getMessage());
		}else{
			System.out.println("计算失败");
		}
		
		/*
		 * axis
		 */
//		Order order = new Order();
//		order.setName("AMD");
//		order.setAmount(5);
//		order.setPrice(new BigDecimal(700));
//		
//		OrderServiceImplService port = new OrderServiceImplServiceLocator();
//		try {
//			OrderService client = port.getOrderServiceImplPort(new URL("http://localhost:8080/cxf/foo/OrderProcess"));
//			ApplicationResponse response = client.processOrder(order);
//			if(response != null && response.getFlag() == 1){
//				System.out.println(response.getMessage());
//			}else if(response != null && response.getFlag() == 0){
//				System.out.println(response.getMessage());
//			}else{
//				System.out.println("计算失败");
//			}
//		} catch (MalformedURLException e) {
//			System.out.println(e.getMessage());
//		} catch (ServiceException e) {
//			System.out.println(e.getMessage());
//		} catch (RemoteException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
