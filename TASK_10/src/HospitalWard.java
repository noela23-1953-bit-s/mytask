public class HospitalWard {
    private MedicalService medicalService;

    public HospitalWard(MedicalService medicalService) {
        this.medicalService = medicalService;
    }
    public void admitPatient(String patientName){
        String result = medicalService.ProvideCare(patientName);
        System.out.println(result);
    }
}
