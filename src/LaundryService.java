public double calculatePrice(String serviceType, String clothType, int quantity) {

    double rate = 0;

    if (serviceType.equalsIgnoreCase("wash")) {

        if (clothType.equalsIgnoreCase("woolen")) rate = 15;
        else rate = 10;

    } else if (serviceType.equalsIgnoreCase("iron")) {

        if (clothType.equalsIgnoreCase("woolen")) rate = 8;
        else rate = 5;

    } else if (serviceType.equalsIgnoreCase("wash+iron")) {

        if (clothType.equalsIgnoreCase("woolen")) rate = 20;
        else rate = 15;

    } else {
        System.out.println("Invalid service!");
    }

    return rate * quantity;
}
