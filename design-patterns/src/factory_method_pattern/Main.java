package factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        FactoryPayment payment = new FactoryPayment();
        Payment p = payment.getPayment("MOMO");
        p.method();
    }
}
