package test4.q06;

public class Test06 {	
	public static void main(String[] args) {		
        // 컴퓨터 객체 생성
        Computer computer = new Computer("E001", "데스크탑", 150, 10, "삼성전자");
        computer.printProductInfo();        
        System.out.println("----------------");      
        
        // 의류 객체 생성
        Clothes tshirt = new Clothes("C001", "T-Shirt", 20, 50, "L");
        tshirt.printProductInfo();
        System.out.println("----------------");
    }
}
