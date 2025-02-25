public class SalesPerson extends Person {
    private String salesPersonID;
    private String salesHistory;

    public SalesPerson(String salesPersonID, String name, String phoneNumber, String salesHistory) {
        super(name, phoneNumber);
        this.salesPersonID = salesPersonID;
        this.salesHistory = salesHistory;
    }

    // Method
    public void createInvoice() {
        System.out.println(name + " is creating an invoice.");
    }

    public void negotiatePurchase() {
        System.out.println(name + " is negotiating a purchase.");
    }

    // Get Set
    public String getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(String salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public String getSalesHistory() {
        return salesHistory;
    }

    public void setSalesHistory(String salesHistory) {
        this.salesHistory = salesHistory;
    }
}
