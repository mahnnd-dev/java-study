package factory_method_pattern;

public class WalletVnpay implements Payment {

    @Override
    public void method() {
        System.out.println("Payment wallet Vnpay");
    }

    @Override
    public String type() {
        return "VNPAY";
    }
}
