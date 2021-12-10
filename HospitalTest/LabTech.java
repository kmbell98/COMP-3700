import java.util.Scanner;
import java.util.ArrayList;

public class LabTech {
    public LabTech(){}

    public void sendAppointmentList() {
        
        System.out.println("\nAppointment Availability:\n--------------------------");
        System.out.println("\n1. January 12 @ 8:00am");
        System.out.println("\n2. January 14 @ 2:00pm");
        System.out.println("\n3. January 20 @ 1:00pm");
        System.out.println("\n4. January 29 @ 10:30am\n");
        System.out.println("\nPlease select desired appointment from list.");
        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();
        scanner.close();
    }

    public void confirmApointment() {
        System.out.println("Appointment confirmed.");
        
    }

    public void performTest() {
        System.out.println("\n\nTesting in progress...");
    }

    public void recordResults() {
        System.out.println("Testing completed. Recording results...");
    }

    public void sendToDoctor() {
        System.out.println("Results sent successfully.");
    }
}