public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("M132", "Ora Good Cat", "001", 2023, "GWM", 500000);

        // Display vehicle info
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + vehicle.getSerialNumber());
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Base Cost: $" + vehicle.getBaseCost());
    }
}
