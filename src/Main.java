import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    static int orderCounter = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LaundryService service = new LaundryService();
        ArrayList<Order> orders = new ArrayList<>();

        // 🔹 Load previous data from file
        try {
            BufferedReader br = new BufferedReader(new FileReader("../data/orders.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String serviceType = parts[2];
                String clothType = parts[3];   // ✅ NEW
                int qty = Integer.parseInt(parts[4]);
                double price = Double.parseDouble(parts[5]);
                String status = parts[6];


                Order order = new Order(id, name, serviceType, clothType, qty, price);
                order.status = status;

                orders.add(order);

                // Update counter
                if (id >= orderCounter) {
                    orderCounter = id + 1;
                }
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }

        System.out.println("=== Smart Laundry Management System ===");

        while (true) {
            System.out.println("\n1. Place Order");
            System.out.println("2. View Orders");
            System.out.println("3. Update Order Status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.ou.print("Enter service (wash/iron/wash+iron):"):
                String serviceType = sc.nextLine();

                System.out.print("Enter cloth type (normal/woolen): ");
                String clothType = sc.nextLine();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                double price = service.calculatePrice(serviceType, clothType, qty);
                if (price == 0) {
                      System.out.println("Order not placed due to invalid service!");
                      continue;
                  }

                Order order = new Order(orderCounter++, name, serviceType, clothType, qty, price);
                orders.add(order);

                // 🔹 Save to file
                try {
                    FileWriter fw = new FileWriter("../data/orders.txt", true);
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
                } else {
                    // 🔹 Rewrite file with updated data
                    try {
                        FileWriter fw = new FileWriter("../data/orders.txt");

                        for (Order o : orders) {
                            fw.write(o.toFileString() + "\n");
                        }

                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error updating file!");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
