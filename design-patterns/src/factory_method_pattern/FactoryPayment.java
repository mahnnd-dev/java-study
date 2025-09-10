package factory_method_pattern;

public class FactoryPayment {

    public Payment getPayment(String type) {
        if (type.equals("MOMO")) {
            return new WalletMomo();
        }
        if (type.equals("VNPAY")) {
            return new WalletVnpay();
        }
        if (type.equals("ONEPAY")) {
            return new WalletOnePay();
        }
        return null;
    }
}
