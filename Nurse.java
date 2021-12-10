public class Nurse extends GeneralStaff {
    private ArrayList<Appointment> localCalendar = new ArrayList<Appointment>();
    public Nurse() { }

 
    @Override
    public void viewSchedule() {
        for (Appointment  a : localCalendar) {
            System.out.println(a.getInfo());
        }
    }

    @Override
    public void requestAppointment(Patient p) {
        p.requestAppointment();
    }

    @Override
    public void cancelAppointment(Patient p) {
        p.cancelAppointment();
    }

    @Override
    public void rescheduleAppointment(Patient p) {
        p.rescheduleAppointment();
    }

    public void addToCalendar(Appointment app) {
        localCalendar.(app);
    }

    public void inputTriageInformation(Appointment app, String notes) {
        app.addNotes(notes);
    }
}