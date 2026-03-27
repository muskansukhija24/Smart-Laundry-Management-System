import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static int orderCounter = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LaundryService service = new LaundryService();
        ArrayList<Order> orders = new ArrayList<>();

        System.out.println("=== Smart Laundry Management System ===");

        while (true) {
           System.out.println("\n1. Place Order");
           System.out.println("2. View Orders");
           System.out.println("3. Update Order Status");
           System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print("Enter service (wash/iron): ");
                String serviceType = sc.nextLine();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                double price = service.calculatePrice(serviceType, qty);

                Order order = new Order(orderCounter++, name, serviceType, qty, price);
                orders.add(order);
                try {
                      FileWriter fw = new FileWriter("data/orders.txt", true);
                      fw.write(order.toFileString() + "\n");
                      fw.close();
                } catch (IOException e) {
                      System.out.println("Error saving order!");
                }

                System.out.println("Order placed successfully!");

            } else if (choice == 2) {
                if (orders.isEmpty()) {
                    System.out.println("No orders found!");
                } else {
                    for (Order o : orders) {
                        o.displayOrder();
                    }
                }

            } else if (choice == 3) {
                   System.out.print("Enter Order ID to update: ");
                   int id = sc.nextInt();
                   sc.nextLine();

                   boolean found = false;

                  for (Order o : orders) {
                         if (o.orderId == id) {
                         System.out.print("Enter new status (Pending/Washing/Completed): ");
                         String newStatus = sc.nextLine();

                         o.status = newStatus;
                         System.out.println("Order status updated!");
                         found = true;
                         break;
                        }
                  }

                   if (!found) {
                         System.out.println("Order not found!");
                   }else {
                         System.out.println("Invalid choice!");
                }
        }

        sc.close();
    }
}
