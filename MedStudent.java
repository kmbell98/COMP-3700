public class MedStudent extends GeneralStaff {
    public MedStudent() {}

    public void inputRecommendation(Appointment app, String notes) {
        app.addNotes(notes);
    }
}