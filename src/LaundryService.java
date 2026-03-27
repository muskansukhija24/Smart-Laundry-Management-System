public class LaundryService {

    public double calculatePrice(String serviceType, int quantity) {
        double rate = 0;

        if (serviceType.equalsIgnoreCase("wash")) {
            rate = 10;
        } else if (serviceType.equalsIgnoreCase("iron")) {
            rate = 5;
        } else {
            System.out.println("Invalid service!");
        }

        return rate * quantity;
    }
}
