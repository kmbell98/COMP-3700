import java.util.Scanner;
import java.util.ArrayList;

public class Patient /*extends Person*/ {
    private String name;
    private String dob;
    private String gender;
    private String patientID;
    private Double height;
    private Double weight;
    private ArrayList<String> allergies = new ArrayList<String>();
    private ArrayList<String> careTeam = new ArrayList<String>();
    private ArrayList<String> prescriptions = new ArrayList<String>();
    private ArrayList<String> localCalendar = new ArrayList<String>();
    private ArrayList<String> personalInfo = new ArrayList<String>();
    private ArrayList<String> conditions = new ArrayList<String>();
    private ArrayList<String> appointmentHistory = new ArrayList<String>();
    
    public Patient(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public void setPatientID (String id) {
        this.patientID = id;
    }


    public void setName (String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setDOB (String d) {
        this.dob = d;
    }

    public void setGender (String g) {
        this.gender = g;
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

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void addToCareTeam(String staff) {
        this.careTeam.add(staff);
    }

    public void listCareTeam() {
        for (String staff : this.careTeam) {
            System.out.println(staff);
        }
    }

    public void addToPrescriptions(String p) {
        this.prescriptions.add(p);
    }

    public void listPrescriptions() {
        for (String p : this.prescriptions) {
            System.out.println(p + " Dosage: 10mg, Refills: 2");
        } 
    }

    public void populatePersonalInformation() {
        personalInfo.add("Name: " + this.name);
        personalInfo.add("Patient ID: " + this.patientID);
        personalInfo.add("Date of Birth: " + this.dob);
        personalInfo.add("Gender: " + this.gender);
        personalInfo.add("Height: " + height.toString() + " in");
        personalInfo.add("Weight: " + weight.toString() + " lbs");

    }

    public void viewPersonalInformation() {
        System.out.println("\nGeneral Information: \n-------------------------");
        for (String info : personalInfo) {
            System.out.println(info);
        }
        System.out.println("\nAllergies: \n-------------------------");
        for (String allergen : allergies) {
            System.out.println(allergen);
        }

        System.out.println("\nConditions: \n-------------------------");
        for (String condition : conditions) {
            System.out.println(condition);
        }

        System.out.println("\n\n");

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

    public void addAppointment(String date) {
        localCalendar.add(date);
    }

    public void requestAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the preferred time type of your appointment request: [MONTH (enter 3-letter abbreviation)] [MORNING] [AFTERNOON]");
        String field = scanner.nextLine();
        System.out.println("\nRequest successfully sent to receptionist.");
        scanner.close();
    }

    public void cancelAppointment() {
        System.out.println("\nCancellation request successfully sent to receptionist.");
    }



    public void requestRefill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the prescription you would like refilled: ");
        String prescriptionName = scanner.nextLine();
        System.out.println("Request successfully sent to pharmacy.");
        scanner.close();
    }

    public void checkIn() {
        System.out.println("\nPatient " + this.name + " has checked in for their appointment.");
    }

    public void addToAppHistory(String notes) {
        appointmentHistory.add(notes);
    }


}