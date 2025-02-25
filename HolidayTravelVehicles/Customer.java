public class Customer extends Person {
    private String customerID;
    private String address;

    public Customer(String customerID, String name, String address, String phoneNumber) {
        super(name, phoneNumber);
        this.customerID = customerID;
        this.address = address;
    }

    //Method
    public void getInvoice() {
        System.out.println("Generating invoice for customer: " + name);
    }

    public void negotiatePurchase() {
        System.out.println(name + " is negotiating a purchase.");
    }

    public void requestTradeIn() {
        System.out.println(name + " is requesting a trade-in.");
    }
    
    //Get Set
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
