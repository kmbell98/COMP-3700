public class PharmacyStaff extends SpecialtyStaff {
    public PharmacyStaff(){}

    public void makeSubstitution(Prescription p1, Prescription p2) {
        System.out.println("Prescription " + p1.getName() + " has been substitutted with " + p2.getName() + ".");
    }

    public void restockInventoryItem(Prescription p) {
        Prescription.restockInventoryItem(p);
    }

    public void checkInventory(Prescription p) {
        System.out.println("Prescription " + p.getName() + " has " + Prescription.getStock(p) + " available.");

    }
}