package test6.sub07;

public class Clothes extends Product {
    // 속성
    private String size;

    // 생성자
    public Clothes(String productId, String name, int price, int quantity, String size) {
        super(productId, name, price, quantity);
        this.size = size;
    }

    // 상품 정보 출력 메서드
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("사이즈 : " + size);
    }
}