package dev.m;

public class Main {
    public static void main(String[] args) {
        User user = new User("manhnd", "tiêu đề", "manhnd@neo.vn");
        UserService service = new UserService();
        service.register(user);
    }
}
