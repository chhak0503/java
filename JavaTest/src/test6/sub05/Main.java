package test6.sub05;

public class Main {

	public static void main(String[] args) {
		// 과목 생성
        Subject java = new Subject("자바");
        Subject database = new Subject("데이터베이스");

        // 학생 생성
        Student student1 = new Student("김유신", "S001");
        Student student2 = new Student("김춘추", "S002");

        // 학생 과목 수강 신청
        student1.enrollSubject(java);
        student1.enrollSubject(database);
        System.out.println("-------------------------");
        
        // 학생 과목 수강 신청
        student2.enrollSubject(java);
        student2.enrollSubject(database);
        System.out.println("-------------------------");

        // 성적 입력
        student1.setScore(java, 96);
        student1.setScore(database, 90);
        System.out.println("-------------------------");
        
        // 성적 입력
        student2.setScore(java, 86);
        student2.setScore(database, 76);
        System.out.println("-------------------------");

        // Subject 정보 출력
        java.printSubjectInfo();        
        System.out.println("-------------------------");
        
        // Subject 정보 출력
        database.printSubjectInfo();
        System.out.println("-------------------------");
                
        // 학생 정보 출력
        student1.printStudentInfo();
        System.out.println("-------------------------");
        
        // 학생 정보 출력
        student2.printStudentInfo();
        System.out.println("-------------------------");
	}
}