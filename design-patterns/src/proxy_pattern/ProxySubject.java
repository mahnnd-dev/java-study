package proxy_pattern;

public class ProxySubject implements Subject {
    private RealSubject realSubject;
    private final String role;

    public ProxySubject(String role) {
        this.role = role;
    }


    @Override
    public void accessResource() {
        if (role.equals("ADMIN")) {
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            realSubject.accessResource();
        } else {
            System.out.println("Access denied: insufficient permissions.");
        }
    }
}
