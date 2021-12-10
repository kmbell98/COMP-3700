public class Receptionist extends Staff {
    public Receptionist() {}

    public void viewUserSchedule(Patient p) {
        p.viewSchedule();
    }

    public void createAppointment(Patient p) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Patiend ID: ");
        String id = scanner.nextLine();
        System.out.println("Please enter date: ");
        String date = scanner.nextLine();
        System.out.println("Appointment created.");
        scanner.close();

    }

    //method is already defined in schedule
    public void editAppointment(Patient p) {

    }

    public void viewRequests() {
        System.out.printlin("Requests in Queue: \n ----------");
        for (Appointment app : Schedule.requestQ) {
            System.out.println(app.getPatientID() + " " + app.getDate());
        }
    }

}