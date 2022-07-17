public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж для кредита на 12 месяцев:");
        System.out.println(service.calculate(1_000_0000, 12));

        System.out.println();
        System.out.println("Ежемесячный платеж для кредита на 24 месяца:");
        System.out.println(service.calculate(1_000_0000, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж для кредита на 36 месяцев:");
        System.out.println(service.calculate(1_000_0000, 36));
    }
}
