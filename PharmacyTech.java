public class PharmacyTech extends PharmacyStaff {
    public PharmacyTech() {}

    public void updateOrderStatus(Order o, OrderStatus os) {
        o.setOrderStatus(os);
    }
}