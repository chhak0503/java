package test6.sub06;

public class Main {
	public static void main(String[] args) {
        // 의사 생성
        Doctor doctor1 = new Doctor("김의사", "D001", "내과");
        Doctor doctor2 = new Doctor("박의사", "D002", "외과");

        // 환자 생성 및 의사에게 할당
        Patient patient1 = new Patient("이환자", "P001", 30, "감기");
        Patient patient2 = new Patient("박환자", "P002", 45, "고혈압");
        Patient patient3 = new Patient("최환자", "P003", 25, "알레르기");
        Patient patient4 = new Patient("김환자", "P004", 36, "비염");
        Patient patient5 = new Patient("정환자", "P005", 52, "허리디스크");
                
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor1.addPatient(patient3);
        
        doctor2.addPatient(patient4);
        doctor2.addPatient(patient5);

        // 의사 정보 및 담당 환자 정보 출력
        System.out.println(doctor1);
        System.out.println(doctor2);
    }
}
