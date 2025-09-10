package factory_method_pattern;

public class WalletOnePay implements Payment {

    @Override
    public void method() {
        System.out.println("Payment wallet OnePay");
    }

    @Override
    public String type() {
        return "ONEPAY";
    }
}
