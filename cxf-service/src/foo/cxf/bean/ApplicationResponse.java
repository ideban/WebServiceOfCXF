package foo.cxf.bean;

/**
 * 输入报文
 * 
 * @author 路飞
 * 
 */
public class ApplicationResponse {

	/**
	 * 执行结果标志 1 成功 0 失败
	 */
	private int flag;

	/**
	 * 订单内容
	 */
	private Order order;

	/**
	 * 服务端返回的其他信息
	 */
	private String message;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
