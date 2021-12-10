public class Doctor extends GeneralStaff {
    private ArrayList<Appointment> localCalendar = new ArrayList<Appointment>();
    private ArrayList<Order> orderHistory = new ArrayList<Order>();
    private String licenseNumber;

    public Doctor() {
    }
    
    public void set licenseNumber(String l) {
        this.licenseNumber = l;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void viewPatientRecords(Patient p) {
        p.viewPersonalInformation();
    }

    public void sendOrderForPrescription(Patient p) {
        SpecialtyStaff.orderQ.add(p);
    }

    public void sendOrderForTest(Patient p) {
        SpecialtyStaff.orderQ.add(p);
    }
    
    @Override
    public ArrayList viewSchedule() {
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

    public void makeVisibleToPatient() {
        System.out.println("Appointment data now visible to patient");
    }

    public String viewRecommendations(Appointment app) {
        app.getNotes();
    }

    public void viewOrders() {
        for (Order o : orderHistory) {
            System.out.println(o.getOrderID());
        }
    }

    public void viewOrderResults(Order o) {
        System.out.println("Status of Order " +  o.getOrderID() " is " + o.getOrderStatus());
    }

}