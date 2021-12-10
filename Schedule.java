/* Maps do not allow duplicate keys. Reconsider data structure.  */
public class Schedule {
    private ArrayList<String> masterCalendar = new ArrayList<String>();
    
    public static ArrayList<Appointment> requestQ = new ArrayList<Appointment>();

    public Schedule() {}


    public void addAppointment(Appointment app) {
        requestQ.add(app);
    }

    public void removeAppointment(Appointment app) {
        requestQ.remove(app);
    }

    public static void editAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Patiend ID: ");
        String id = scanner.nextLine();
        int i = 1;
        for (Appointment app : requestQ) {
            if (app.getPatientID().equals(id)) {
                System.out.println("Upcoming Appointments: \n" + "----------------- \n" + i + ". " + app.getDate());
                i++;
            }
        }

        System.out.println("Enter the appointment you wish to edit. ");
        String appNum = scanner.nextLine();
        System.out.println("Appointment edited.");
        scanner.close();
       
    }

    // method does not account for weekends
    public void populateCalendar() {
        for (int i = 1; i < 30; i++) {
            for (double j = 8; j < 16; j += 0.5) {
                if (j - (j - 0.5) == 0.5) {
                    masterCalendar.add("September " +  i + ", 2023 @" + j + ":30");
                } else {
                    masterCalendar.add("September " +  i + ", 2023 @" + j + ":00");
                }
            }
            
        }
    }



}