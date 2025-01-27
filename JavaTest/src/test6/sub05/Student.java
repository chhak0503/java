package test6.sub05;

public class Student {
	// 속성
    private String name;
    private String studentId;
    private Subject[] subjects;
    private int[] scores;
    private int subjectCount;

    // 생성자
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new Subject[10]; // 초기 크기 10의 배열
        this.scores = new int[10];
        this.subjectCount = 0;
    }

    // 메서드
    public void enrollSubject(Subject subject) {        
        subjects[subjectCount] = subject;
        subject.addStudent(this);
        scores[subjectCount++] = 0; // 성적은 아직 입력되지 않음
        
        System.out.println(name + " - " + subject.getSubName() + " 과목 신청완료");
    }

    public void setScore(Subject subject, int score) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].equals(subject)) {
            	scores[i] = score;
            	System.out.println(name + " - " + subject.getSubName() + " 점수 입력완료");    	
                return;
            }
        }        
    }

    public void printStudentInfo() {
        System.out.println("학생명 : " + name);
        System.out.println("아이디 : " + studentId);
        System.out.println("성적");
        for (int i = 0; i < subjectCount; i++) {        	
            System.out.println(" - " + subjects[i].getSubName() + ":" + scores[i]);
        }
    }

    // Getter
    public String getName() {
        return name;
    }
}