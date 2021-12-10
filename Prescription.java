public class Prescription extends Order {
    private String requestedItem;
    private double cost;
    private Integer dosage;
    private Integer remainingRefills;
    private boolean substitutionPermitted = false;
    private boolean substitutionUsed = false;
    private boolean sufficientInventory = true;
    private ArrayList<String> generalInfo = new ArrayList<String>();

    public public Prescription (Doctor doc, Patient p, String requestedItem) {
        super(doc, patient);
        this.requestedItem = requestedItem;
    }
    
    public void getInfo() {
        System.out.println("Prescription Info: \n ---------------");
        for (String field : generalInfo) {
            System.out.println(field);
        }
    }

    public String getName() {
        return this.requestedItem;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void populateInfo() {
        generalInfo.add("Name: " + this.requestedItem);
        generalInfo.add("Dosages: 5mg, 10mg, 20mg");
        generalInfo.add("Cost:" + this.cost + "Per Bottle");
        generalInfo.add("Availability:" + this.sufficientInventory); 
    }


    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public Integer getRemainingRefills() {
        return this.remainingRefills; 
    }

    public void setRefills(Integer i) {
        this.remainingRefills = i;
    }

    public void allowSubstitution(boolean permission) {
        this.substitutionPermitted = permission;
    }

    public boolean getSubstitutionPermission() {
        return this.substitutionPermitted;
    }

    public boolean checkInventory() {
        if(PrescriptionInventory.getStock(this) >= 1) {
            return sufficientInventory;
        } 
        return false;
    }


}