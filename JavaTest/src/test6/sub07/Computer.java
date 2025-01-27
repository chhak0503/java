package test6.sub07;

public class Computer extends Product {
    // 속성
    private String manufactor;

    // 생성자
    public Computer(String productId, String name, int price, int quantity, String manufactor) {
        super(productId, name, price, quantity);
        this.manufactor = manufactor;
    }

    // 상품 정보 출력 메서드
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("제조사 : " + manufactor);
    }
}