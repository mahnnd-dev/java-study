package singleton_pattern;

public class Main {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton);
    }
}
