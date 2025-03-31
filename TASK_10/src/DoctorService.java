public class DoctorService implements MedicalService{
    private String DoctorName;
    int DoctorId;

    public DoctorService(String doctorName, int doctorId) {
        DoctorName = doctorName;
        DoctorId = doctorId;
    }

    @Override
    public String ProvideCare(String patientName) {
        System.out.println("Doctor " +  DoctorName + " is providing care to " + patientName);
        return "Patient" + patientName + " has been treated by Doctor " + DoctorName;
    }
}
