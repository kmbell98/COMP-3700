public class PrescriptionInventory {
    private static Map<Prescription, Integer> inventory = new HashMap<Prescription, Integer>();
    public PrescriptionInventory() {}


    public void addPrescription(Prescription p, Integer stock) {
        inventory.put(p, stock);
    }

    public static Integer getStock(Prescription p) {
        return inventory.get(p);
    }

    public void dispense(Prescription pr, Patient pa) {

        addPrescription(pr, inventory.get(pr) - 1);
        System.out.println("Prescription " + pr + " has been dispensed to patient " pa.getName());
    }

    public static void restockInventoryItem(Prescription p) {
        addPrescription(pr, inventory.get(pr) +  100);
    }
}