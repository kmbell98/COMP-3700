public class Pharmacist {
    public Pharmacist(){}
    public void checkInventory() {
        System.out.println("\nPrescription is in stock.");

    }

    public void dispense(Patient p) {
        System.out.println("\nPrescription has been successfully dispensed to " + p.getName() + ".");
    }
}