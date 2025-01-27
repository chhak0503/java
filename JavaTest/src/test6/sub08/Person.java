package test6.sub08;

public class Person {
	protected String name;
	protected String birth;
	
	public Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	// 정보 출력 메서드
    public void printPersonInfo() {        
        System.out.println("이름 : " + name);
        System.out.println("생년월일 : " + birth);
    }
}