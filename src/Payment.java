public class Payment {
    int paymentId;
    double amount;
    String status;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Paid";
    }
}
