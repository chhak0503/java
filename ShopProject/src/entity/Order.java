package entity;

public class Order {
	private int orderNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	
	public Order() {}
	public Order(int orderNo, String orderId, int orderProduct, int orderCount, String orderDate) {
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
	}
	public Order(String orderId, int orderProduct, int orderCount) {
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;
	}

	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct + ", orderCount="
				+ orderCount + ", orderDate=" + orderDate + "]";
	}
}
