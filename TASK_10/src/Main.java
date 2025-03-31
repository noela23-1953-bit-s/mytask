//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MedicalService doctorService = new DoctorService("Mr Kato",30);
        MedicalService nurseService = new NurseService("Miss Harriet");

        HospitalWard generalWard = new HospitalWard(doctorService);
        HospitalWard pediatricWard = new HospitalWard(nurseService);


        System.out.println("The Patient is being Admitted to General Ward:");
        generalWard.admitPatient("Mr Kabuga");

        System.out.println("\n Admitting patient to Pediatric Ward:");
        pediatricWard.admitPatient("Mis Jane");
    }
}
