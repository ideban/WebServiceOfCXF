package foo.cxf.bean;

import java.math.BigDecimal;

/**
 * 
 * 定义订单类
 * 
 * @author 路飞
 * 
 */
public class Order {

	/** 商品名 */
	private String name;

	/** 数量 */
	private int amount;

	/** 单价 */
	private BigDecimal price;

	/** 总价 */
	private BigDecimal total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
