package test6.sub06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
    private String id;
    private String special;
    private List<Patient> patients;

    public Doctor(String name, String id, String special) {
        this.name = name;
        this.id = id;
        this.special = special;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("의사: ").append(name).append("(ID: ").append(id).append(", 전문분야: ").append(special).append(")\n");
        sb.append("담당 환자 목록:\n");
        for (Patient patient : patients) {
            sb.append("- ").append(patient).append("\n");
        }
        return sb.toString();
    }
}