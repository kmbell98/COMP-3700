import java.util.Scanner;

public class Patient extends Person {
    private String patientID;
    private ArrayList<String> allergies;
    private double height;
    private double weight;
    private ArrayList<Staff> careTeam = new ArrayList<Staff>();
    private ArrayList<Prescription> prescriptions;
    private ArrayList<String> localCalendar = new ArrayList<String>();
    private ArrayList<String> personalInfo = new ArrayList<String>();
    private ArrayList<String> conditions = new ArrayList<String>();
    private ArrayList<String> appointmentHistory = new ArrayList<String>();


    public Patient() {}

    public void setPatientID (String id) {
        this.patientID = id;
    }

    public String getPatientID() {
        return this.patientID;
    }

    public void addAllergy(String allergen) {
        this.allergies.add(allergen);
    }

    public void listAllergies() {
        for (String allergen : this.allergies) {
            System.out.println(allergen); //void methods can still use print 
        }
    }

    public void addCondition(String condition) {
        this.conditions.add(condition);
    }

    public void listConditions() {
        for (String condition : this.conditions) {
            System.out.println(condition); 
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addToCareTeam(Staff staff) {
        this.careTeam.add(staff);
    }

    public void listCareTeam() {
        for (Staff staff : this.careTeam) {
            System.out.println(staff);
        }
    }

    public void addToPrescriptions(Prescription p) {
        this.prescriptions.add(p);
    }

    public void listPrescriptions() {
        for (Prescription p : this.prescriptions) {
            System.out.println(p.getName() + " Dosage: 10mg, Refills: " + p.getRemainingRefills());
        } 
    }

    public void populatePersonalInformation() {
        personalInfo.add("Patient ID: " + this.patientID);
        personalInfo.add("Height: " + this.height);
        personalInfo.add("Weight: " + this.weight);

    }

    public void viewPersonalInformation() {
        System.out.println("General Information: \n ----------------");
        for (String info : this.personalInfo) {
            System.out.println(info);
        }
        System.out.println("Allergies: \n ----------------");
        for (String allergen : allergies) {
            System.out.println(allergen);
        }

        System.out.println("Conditions: \n ----------------");
        for (String condition : conditions) {
            System.out.println(condition);
        }


    }

    public void editPersonalInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the field you wish to edit: [NAME] [ADDRESS] [PHONE]");
        String field = scanner.nextLine();
        switch (field) {
            case "name":
                System.out.println("Please enter name: ");
                String newName = scanner.nextLine();
                break;
            case "address":
                System.out.println("Please enter address: ");
                String newAddr = scanner.nextLine();
                break;
            case "phone":
                System.out.println("Please enter phone number: ");
                String newPhone = scanner.nextLine();
                break;
            default:
                throw new IllegalArgumentException("Invalid input. Please enter the field you wish to edit: [NAME] [ADDRESS] [PHONE] ");
        }

        scanner.close();
        
    }

    /* For patient, this method just allows them to see their upcoming appointments. 
    Other classes can see other patients in their calendar */
    public void viewSchedule() {
        for (String date : localCalendar) {
            System.out.println(date);
        }
    }

    public void requestAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the preferred time type of your appointment request: [MONTH (enter 3-letter abbreviation)] [MORNING] [AFTERNOON]");
        String field = scanner.nextLine();
        Appointment app = new Appointment(this.patientID, field);
        Schedule.requestQ.add(app);
        scanner.close();
    }

    public void cancelAppointment(Appointment app) {
        for (Appointment a : Schedule.requestQ) {
            if (app.patientID.equals(a.patientID) && app.window.equals(a.window)) {
                Schedule.requestQ.remove();
            }
        }

    }

    public String viewAppointmentNotes(Appointment app) {
        return app.getNotes();
    }

    public void requestRefill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the prescription you would like refilled: ");
        String prescriptionName = scanner.nextLine();
        Prescription p = new Prescription(this.patientID, prescriptionName);
        Pharmacist.orderQ.add(p);
        scanner.close();
    }

}