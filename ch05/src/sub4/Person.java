package sub4;

public class Person {
	// 속성
    protected String name;
    protected int age;
    
    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 메소드
    public void work() {
        System.out.println("Person is working");
    }
    
    public void introduce() {
    	System.out.println("제 이름은 "+name+"이고 나이는 "+age+"세 입니다.");
    }
}
