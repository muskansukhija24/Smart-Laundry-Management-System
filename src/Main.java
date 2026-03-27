import java.util.*;

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
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

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
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
