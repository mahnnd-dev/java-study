package factory_method_pattern;

public class WalletMomo implements Payment {

    @Override
    public void method() {
        System.out.println("Payment wallet Momo");
    }

    @Override
    public String type() {
        return "MOMO";
    }
}
