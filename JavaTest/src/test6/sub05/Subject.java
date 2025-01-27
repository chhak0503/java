package test6.sub05;

public class Subject {
	// 속성
    private String subName;
    private Student[] students;
    private int studentCount;

    // 생성자
    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10]; // 초기 크기 10의 배열
        this.studentCount = 0;
    }

    // 메서드
    public void addStudent(Student student) {
        students[studentCount++] = student;
    }    

    public void printSubjectInfo() {
        System.out.println("과목명 : " + subName);
        System.out.print("수강생 : ");
        
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName() + ", ");
        }
        
        System.out.println();
    }

    // Getter
    public String getSubName() {
        return subName;
    }
}