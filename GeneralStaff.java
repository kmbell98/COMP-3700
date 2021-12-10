public class GeneralStaff extends Staff {
    public GeneralStaff () {

    }

    /** Methods below will be overriden in child classes*/
    public void editPersonalInformation() {
        return;
    }

    public ArrayList viewSchedule() {
        return;
    }

    public void requestAppointment() {
        return;
    }

    public void cancelAppointment() {
        return;
    }

    public void rescheduleAppointment() {
        return;
    }

    public void inputObservation(Appointment app, String notes) {
        app.addNotes(notes);
    }
}