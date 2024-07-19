package test4.q09;

import java.util.List;

public class Test09 {
	 public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall();

        // 고객 생성
        Customer customer1 = new Customer("A101", "김유신", "010-1234-1001");
        Customer customer2 = new Customer("A102", "김춘추", "010-1234-1002");

        // 고객 추가
        shoppingMall.addCustomer(customer1);
        shoppingMall.addCustomer(customer2);

        // 제품 생성
        Product laptop = new Electronics("노트북", 800000);
        Product tshirt = new Clothing("티셔츠", 15000);
        Product banana = new Food("바나나", 3000);

        // 주문 생성
        Order order1 = new Order(1, customer1);
        order1.addProduct(laptop);
        order1.addProduct(tshirt);

        Order order2 = new Order(2, customer2);
        order2.addProduct(tshirt);
        order2.addProduct(banana);

        // 주문 추가
        shoppingMall.addOrder(order1);
        shoppingMall.addOrder(order2);

        // 모든 주문 출력
        List<Order> orders = shoppingMall.getOrders();
        for (Order order : orders) {
            System.out.println("주문번호 : " + order.getOrderNo());
            System.out.println("고객이름 : " + order.getCustomer().getName());
            System.out.println("주문금액 : " + order.getTotalAmount()+"원");
            System.out.println("주문목록");
            for (Product product : order.getProducts()) {
                System.out.println(" - " + product.getName() + " ￦" + product.getPrice());
            }
            System.out.println();
        }

        // 특정 고객의 주문 목록 출력
        List<Order> ordersForCustomer1 = shoppingMall.getOrdersByCustomer("A101");        
        for (Order order : ordersForCustomer1) {
            System.out.println("- 주문번호 : " + order.getOrderNo() + ", 주문금액 : " + order.getTotalAmount());
        }
    }
}















