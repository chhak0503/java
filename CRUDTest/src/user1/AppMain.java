package user1;

import java.util.Scanner;

/**
 * 날짜 : 2025/01/27
 * 이름 : 김철학
 * 내용 : Java CRUD 실습하기
 */
public class AppMain {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------");
		System.out.println("User1 CRUD 실습");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		User1Dao dao = User1Dao.getInstance();
		
		while(isRunning) {
			
			System.out.println("0:종료, 1:입력, 2:조회, 3:검색, 4:수정, 5:삭제");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			switch (answer) {
			case 0:
				isRunning = false;
				break;
			case 1:
				User1 user = inputUser(sc);
				dao.insertUser1(user);
				System.out.println("INSERT 완료...");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}
		System.out.println("프로그램 종료...");		
	} // main end
	
	public static User1 inputUser(Scanner sc) {
		
		sc.nextLine(); // 입력 버퍼 비우기
		
		System.out.print("아이디 입력 : ");
		String uid = sc.nextLine();
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 입력 : ");
		String hp = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		User1 user = new User1(uid, name, hp, age);
		//System.out.println(user);
		return user;
	}
	
	public static void showUsers() {}
	
	public static void findUser() {}
	
	public static void modifyUser() {}
	
	public static void removeUser() {}
	
	
	
	
}























