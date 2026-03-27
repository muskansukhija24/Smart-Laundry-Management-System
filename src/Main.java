import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LaundryService service = new LaundryService();

        System.out.println("=== Smart Laundry Management System ===");

        while (true) {
            System.out.println("\n1. Place Order");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // clear buffer

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print("Enter service (wash/iron): ");
                String serviceType = sc.nextLine();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                double price = service.calculatePrice(serviceType, qty);

                System.out.println("Total Price: " + price);
                System.out.println("Order placed successfully!");

            } else if (choice == 2) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
