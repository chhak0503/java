package test6.sub08;

public class Developer extends Employee {
    // 속성
    private String field;

    // 생성자
    public Developer(String name, String birth, String employeeId, String dept, int salary, String field) {
        super(name, birth, employeeId, dept, salary);
        this.field = field;
    }

    // 프로그래밍 언어 변경 메서드
    public void changeField(String newField) {
        this.field = newField;
        System.out.println("개발 분야 변경");
    }

    // 직원 정보 출력 메서드
    public void printDeveloperInfo() {
        super.printEmployeeInfo();
        System.out.println("개발분야 : " + field);
    }
}