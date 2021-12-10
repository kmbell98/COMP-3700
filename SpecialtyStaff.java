public class SpecialtyStaff extends Staff {
    String assignee;
    public static ArrayList<Patient> orderQ = new ArrayList<Patient>();


    public SpecialtyStaff() {}

    public void viewOrderQueue() {
        int i = 1;
        System.out.println("Orders in queue: \n ---------------")
        for (Order o : orderQ) {
            System.out.println(i + ". " + o);
        }
        
    }


    public void inputOrderNotes(Order o, String notes) {
        o.addNotes(notes);
    }

    public void updateOrderStatus(Order o, OrderStatus status) {
        o.status = status;
    }

    public void updateOrderAssignee(SpecialtyStaff staff) {
        this.assignee = staff.getName() + " " + staff.getEmployeeID();
    }

    
}