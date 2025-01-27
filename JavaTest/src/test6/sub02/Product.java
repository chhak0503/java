package test6.sub02;

public class Product {
	// 속성
    private String productId;
    private String productName;
    private int price;
    private int quantity;

    // 생성자
    public Product(String productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // 가격 수정 메서드
    public void updatePrice(int newPrice) {        
        this.price = newPrice;
        System.out.println(productName + " 가격 수정 됨");        
    }

    // 재고 추가 메서드
    public void addStock(int amount) {
        this.quantity += amount;
        System.out.println(productName +" "+ quantity +"개 재고 추가 됨");
    }

    // 상품 정보 출력 메서드
    public void printProductInfo() {
        System.out.println("상품 ID : " + productId);
        System.out.println("상품이름 : " + productName);
        System.out.println("상품가격 : " + price);
        System.out.println("재고수량 : " + quantity);
    }
}