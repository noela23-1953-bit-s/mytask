public class NurseService implements MedicalService{
    private String NurseName;
    private int NurseTelNo;

    public NurseService(String NurseName) {
        super.NurseName = NurseName;
    }

    @Override
    public String ProvideCare(String patientName) {
        System.out.println("Nurse + " + NurseName + " is providing care to " + patientName);
        return "Patient" + patientName + " has been treated by Nurse " + NurseName;
    }
}
