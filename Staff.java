public class Staff extends Person {
    private String employeeID;
    private int hospitalFloor;
    private String department;
    private String title;

    public Staff() {}

    public void viewPatientRecords(Patient p) {
        p.viewPersonalInformation();
    }

// I feel that the addNotes method in the Appointment class does this already
    //public void inputAppointmentNotes() {    }
    
    public void viewPersonalInformation() {
        System.out.println("Name: " this.name);
        System.out.println("Title: " + this.title);
        System.out.println("Employee ID: " this.employeeID);
        System.out.println("Department: " this.department);
        System.out.println("Floor: " this.hospitalFloor);
        
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void getTitle() {
        return this.title;
    }

    // I don't know if this prevents Staff s = new Doctor(); from working

    public void setEmployeeID(String id) {
        this.employeeID = id;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setFloor(int floor) {
        this.hospitalFloor = floor;
    }

    public int getFloor() {
        return this.hospitalFloor;
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public String getDepartment() {
        return this.department;
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

     /** Methods below will be overriden in child classes*/

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
}