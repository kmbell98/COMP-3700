import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Appointment {
    private String notes;
    private String appDate;
    private Integer duration;
    private String location;
    private ArrayList<Staff> staffAttendees;
    private ArrayList<String> info;
    private AppointmentStatus status;
    private String patientID;
    private String window;

    public Appointment(Patient p, String window) {
        this.patientID = p.getPatientID();
        this.window = window;
    }

    public enum AppointmentStatus {
        REQUESTED, UPCOMING, IN-PROGRESS, CONCLUDED, PENDING-CANCELLATION,
            PENDING-RESCHEDULE, CANCELLED;
    }

    public String getPatientID() {
        return this.patientID;
    }

    public void addNotes(String notes) {
        this.notes += notes;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date of the appointment: ");
        String calendarDate = scanner.nextLine() + " ";
        
        System.out.println("Please enter the time of the appointment: ");
        calendarDate += scanner.nextLine();

        DateTimeFormatter appDatePattern = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        this.appDate = LocalDate.parse(calendarDate, appDatePattern);
    }

    public String getDate() {
        return this.appDate;
    }

    public void setDuration(int time) {
        this.duration = time;
    }

    public void setLocation(String department) {
        this.location = department;
    }

    public String getLocation() {
        return this.location;
    }

    public void addStaff(Staff staff) {
        staffAttendees.add(staff);
    }

    public void setStatus(AppointmentStatus as) {
        this.status = as;
    }

    public void getStatus() {
        return this.status;
    }


    public void populateInfo() {
        info.add("Date: " + this.appDate);
        info.add("Patient ID: " + this.patientID);
        info.add("Duration: " + this.duration.toString());
        info.add("Location: " +  this.location);
    }

    public void addToSchedule(Nurse n) {
        n.addToCalendar(this);
    }

    public void getInfo() {
        for (String item : info) {
            System.out.println(item);
        }
    }
}