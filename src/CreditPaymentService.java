public class CreditPaymentService {

    public double calculate(int creditAmount, int month) {
        double percent = 0.0999;
        double monthPayment = creditAmount * percent * Math.pow(1 + percent, month) / (Math.pow(1 + percent, month) - 1);

        return monthPayment;

    }
}
