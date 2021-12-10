public class Radiologist extends RadiologyStaff {
    public Radiologist () {}
    
    public void verifyOrderStatus(Order o) {
        System.out.print(o.getOrderStatus().toString());
    }
}