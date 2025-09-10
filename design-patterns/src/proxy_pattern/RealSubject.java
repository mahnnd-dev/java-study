package proxy_pattern;


public class RealSubject implements Subject {
    @Override
    public void accessResource() {
        System.out.println("Accessing protected resource...");
    }
}
