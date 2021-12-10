public class RadiolgyTech extends RadiologyStaff {
    public RadiologyStaff () {
        
    }

    public void updateOrderStatus(Order o, OrderStatus os) {
        o.setOrderStatus(os);
    }
}