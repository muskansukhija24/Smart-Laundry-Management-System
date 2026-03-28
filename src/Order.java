public class Order {
    int orderId;
    String userName;
    String serviceType;
    int quantity;
    double price;
    String status;
    String clothType;

    public Order(int orderId, String userName, String serviceType, String clothType, int quantity, double price) {
    this.orderId = orderId;
    this.userName = userName;
    this.serviceType = serviceType;
    this.clothType = clothType;
    this.quantity = quantity;
    this.price = price;
    this.status = "Pending";
     }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("User: " + userName);
        System.out.println("Service: " + serviceType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("clothtype: " + clothType);
    }

    public String toFileString() {
           return orderId + "," + userName + "," + serviceType + "," + clothType + "," + quantity + "," + price + "," + status;
}
}
