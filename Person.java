import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

abstract class Person {

    private boolean isOnline = false;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String password;

    
    public Person () {
    }



    void logIn(String password) {
        if(password.equals(this.password)) {
            this.isOnline = true;
        }
    }

    void logOut() {
        this.isOnline = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDOB(String dob) {
        DateTimeFormatter dobPattern = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.dateOfBirth = LocalDate.parse(dob, dobPattern);
    }

    public String getDOB() {
        return this.dateOfBirth;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }

    public void viewPersonalInformation();

    public void editPersonalInformation();

    public void viewSchedule();

    public void requestAppointment(); certain classes only

    public void cancelAppointment();



}