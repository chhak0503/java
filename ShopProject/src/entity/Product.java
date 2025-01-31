package entity;

public class Product {
	private int prodNo;
	private String prodName;
	private int stock;
	private int price;
	private String company;
	
	public Product() {}
	public Product(int prodNo, String prodName, int stock, int price, String company) {
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}
	public Product(String prodName, int stock, int price, String company) {		
		this.prodName = prodName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}

	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Product [prodNo=" + prodNo + ", prodName=" + prodName + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
}
