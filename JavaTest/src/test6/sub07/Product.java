package test6.sub07;

public class Product {
	// 속성
    protected String productId;
    protected String productName;
    protected int price;
    protected int quantity;

    // 생성자
    public Product(String productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // 상품 정보 출력 메서드
    public void printProductInfo() {
        System.out.println("상품코드 : " + productId);
        System.out.println("상품이름 : " + productName);
        System.out.println("상품가격 : " + price);
        System.out.println("재고수량 : " + quantity);
    }
}