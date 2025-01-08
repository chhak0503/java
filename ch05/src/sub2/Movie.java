package sub2;

public class Movie {
	
	// 속성
	private String title;
	private String director;
	private double rating;
	private int availableSeats;

	
	// 생성자
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	// 메서드
	public boolean reserveSeat() {
		
		if(availableSeats > 0) {
			availableSeats--;
			return true;
		}else {
			return false;
		}
		
	}
	
	public void cancelReservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("영화제목 : " + this.title);
		System.out.println("영화감독 : " + this.director);
		System.out.println("영화평점 : " + this.rating);
		System.out.println("예약 가능한 좌석 수 : " + this.availableSeats);
	}
	
}










