public class DealerOption {
    private String optionCode;
    private String description;
    private double price;
    private String invoiceID;

    public DealerOption(String optionCode, String description, double price, String invoiceID) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
        this.invoiceID = invoiceID;
    }

    //Get Set
    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }
}
