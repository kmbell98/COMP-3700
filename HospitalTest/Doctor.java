import java.util.ArrayList;

public class Doctor /* extends GeneralStaff */ {
    private ArrayList<String> localCalendar = new ArrayList<String>();
    private ArrayList<String> orderHistory = new ArrayList<String>();
    private String licenseNumber;

    public Doctor() {
    }
    
    public void beginAppointment() {
        System.out.println("\nAppointment has begun.");
    }
    public void addNotes(Patient p, String notes) {
        p.addToAppHistory(notes);
    }

    public void concludeAppointment() {
        System.out.println("\nAppointment has been conlcuded.");
    }

    public void makeVisibleToPatient(Patient p) {
        System.out.println("\nAppointment data is now available to patient " + p.getName() + ".");
    }

    public void sendOrderForPrescription(Patient p) {
        System.out.println("\nPrescription has been ordered for patient " + p.getName() + ".");
    }

    public void sendOrderForTest(Patient p) {
        System.out.println("\nTest has been ordered for patient " + p.getName() + ".");
    }

}