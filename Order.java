public class Order {

    private String orderID;
    private String patientID;
    private OrderStatus status;
    private Doctor sender;
    private SpecialtyStaff assignee;
    private String notes;
    

    public Order(Doctor doc, Patient p) {
        this.sender = doc;
        this.patientID = p.getPatientID();
    }

    public enum OrderStatus {
        RECEIVED, UP-NEXT, IN-PROGRESS, ON-HOLD, CANCELLED, PENDING-CANCELLATION, 
        COMPLETED, PENDING-REFILL, READY-FOR-PICK-UP, PICKED-UP;
    }
}

public void setOrderID(String id) {
    this.orderID = id;
}

public String getOrderID() {
    return this.orderID;
}


public String getPatientID() {
    return this.patientID;
}

public void setOrderStatus (OrderStatus status) {
    this.status = status;
}

public OrderStatus getOrderStatus() {
    return this.status;
}

public void addNotes(String notes) {
    this.notes += notes;
}

public void setAssignee(SpecialtyStaff staff) {
    this.staff = staff;
}

