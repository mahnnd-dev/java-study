package dev.m.setter;

import dev.m.EmailSender;
import dev.m.User;
import dev.m.UserRepository;

public class Main {
    public static void main(String[] args) {
        User user = new User("manhnd", "Session 04 DI Ioc", "manhnd@neo.vn");
        EmailSender emailSender = new EmailSender();
        UserRepository userRepository = new UserRepository();
        UserServiceSetter service = new UserServiceSetter();
        service.setEmailSender(emailSender);
        service.setUserRepository(userRepository);
        service.register(user);
    }
}
