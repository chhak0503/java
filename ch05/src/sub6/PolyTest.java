package sub6;

/*
 * 날짜 : 2025/01/10
 * 이름 : 김철학
 * 내용 : Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특징
 *  - 객체(참조변수) 타입선언을 부모클래스 타입으로 선언
 *  - 다형성을 활용해서 프로그래밍의 중복을 줄이고 통일성과 유연성을 향상
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성을 적용한 객체 생성(업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();		
		
		a2.move();
		a2.hunt();				
	
		a3.move();
		a3.hunt();
		
		// 다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 타입 비교연산
		if(a1 instanceof Tiger) {
			
			System.out.println("a1은 Tiger 입니다.");
			
		}else if(a2 instanceof Eagle) {
			
			System.out.println("a2는 Eagle 입니다.");
			
		}else if(a3 instanceof Shark) {
			
			System.out.println("a3는 Shark 입니다.");
		}
		
		// 다형성을 활용한 객체 배열		
		Animal arr[] = {tiger, eagle, shark};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		/*
		다형성 확인문제
		
		1) Pet 클래스를 정의하시오. 
		 - 클래스 내용은 아래 내용을 참고해 작성하세요.
		
		2) Pet 클래스를 상속받는 Dog, Cat 클래스를 정의하시오. 
		 - Dog, Cat 클래스는 makeSound() 메서드를 재정의 하세요.
		 - Dog는 "멍멍" 출력
		 - Cat 은 "야옹" 출력
		
		3) Main 클래스에서 Dog, Cat 객체를 생성하고 정적 메서드 printSound() 를 정의하시오.
		 - main() 메서드에서 printSound() 메서드를 호출하시오.
		 - printSound()는 Dog, Cat 객체를 인자로 받는 매개변수를 선언하세요.
		 - printSound()는 매개변수를 이용해 Dog, Cat의 makeSound()를 호출하세요.
		*/
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		printSound(dog);
		printSound(cat);		
		
	}// main() end
	
	
	public static void printSound(Pet pet) { // 다형성이 적용된 메서드 매개변수
		pet.makeSound();		
	}
	
	
}
















