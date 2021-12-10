public class Pharmacist extends PharmacyStaff {
    public Pharmacist() {}

    public void verifyOrderStatus(Order o) {
        System.out.print(o.getOrderStatus().toString());
    }
}