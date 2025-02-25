public class SalesInvoice {
    private String invoiceID;
    private String date;
    private double finalPrice;
    private String customerID;
    private String salesPersonID;
    private String vehicleID;
    private double tax;
    private double licenseFees;
    private double tradeInAllowance;
    private String customerSignature;

    public SalesInvoice(String invoiceID, String date, double finalPrice, String customerID, String salesPersonID,
                        String vehicleID, double tax, double licenseFees, double tradeInAllowance, String customerSignature) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.customerID = customerID;
        this.salesPersonID = salesPersonID;
        this.vehicleID = vehicleID;
        this.tax = tax;
        this.licenseFees = licenseFees;
        this.tradeInAllowance = tradeInAllowance;
        this.customerSignature = customerSignature;
    }

    // Method
    public void requestDealerInstalledOptions() {
        System.out.println("Requesting dealer-installed options for invoice: " + invoiceID);
    }

    public void summarizedFinalPrice() {
        System.out.println("Final price summary for invoice " + invoiceID + ": $" + finalPrice);
    }

    // Get Set
    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(String salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getLicenseFees() {
        return licenseFees;
    }

    public void setLicenseFees(double licenseFees) {
        this.licenseFees = licenseFees;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
    }

    public String getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
    }
}