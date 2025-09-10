package proxy_pattern;

public class Main {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject("ADMIN");
        proxySubject.accessResource();
    }
}
