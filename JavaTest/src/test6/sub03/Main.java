package test6.sub03;

public class Main {
	public static void main(String[] args) {
        // 티켓 객체 생성
        MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");

        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");
        
        // 예약 테스트
        ticket.bookTicket();
        System.out.println("-------------------------");
        
        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");

        // 이미 예약된 경우
        ticket.bookTicket();
        System.out.println("-------------------------");

        // 취소 테스트
        ticket.cancelBooking();
        System.out.println("-------------------------");
        
        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");
        
        // 이미 취소된 경우
        ticket.cancelBooking();
        System.out.println("-------------------------");
    }
}