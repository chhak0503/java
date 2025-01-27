package test6.sub04;

public class Book {
	// 속성
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // 메서드
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("도서대출 : " + title);
        } else {
            System.out.println(title + " 이미 대출됨");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("도서반납 : " + title);
        } else {            
            System.out.println(title + " 이미 반납됨");
        }
    }

    public void getBookInfo() {        
        System.out.println("도서명 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("대출여부 : " + (!isBorrowed ? "가능" : "불가능"));
    }

    // Getter
    public String getTitle() {
        return title;
    }
}