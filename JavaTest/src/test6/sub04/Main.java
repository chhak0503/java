package test6.sub04;

public class Main {
	
	public static void main(String[] args) {		
        // 도서 생성
        Book book = new Book("이것이 자바다", "신용권", "101-1234-1001");
        
        // 회원 생성
        Member member = new Member("홍길동", "A001");

        // 도서 정보 출력
        book.getBookInfo();
        System.out.println("--------------------");
        
        // 도서 대출
        member.borrowBook(book);
        System.out.println("--------------------");
        
        // 도서 정보 출력
        book.getBookInfo();
        System.out.println("--------------------");
                
        // 회원 정보 출력
        member.getMemberInfo();
        System.out.println("--------------------");
                
        member.borrowBook(book);
        System.out.println("--------------------");
        
        // 도서 반납
        member.returnBook(book);
        System.out.println("--------------------");        

        // 회원 정보 출력
        member.getMemberInfo();
        System.out.println("--------------------");
    }
}