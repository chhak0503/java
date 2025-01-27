package test6.sub04;

public class Member {
	// 속성
    private String name;
    private String memberId;
    private Book borrowedBook;

    // 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    // 메서드
    public void borrowBook(Book book) {
        book.borrowBook();
        borrowedBook = book;
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBook = null;
    }

    public void getMemberInfo() {
    	System.out.println("회원명 : " + name);
    	System.out.println("아이디 : " + memberId);
    	
    	if(borrowedBook != null) {
    		System.out.println("대출한 도서 : " + borrowedBook.getTitle());
    	}else {
    		System.out.println("대출한 도서 : 없음");
    	}    	
    }
}