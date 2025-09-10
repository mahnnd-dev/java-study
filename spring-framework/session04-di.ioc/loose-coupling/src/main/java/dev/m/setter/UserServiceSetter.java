package dev.m.setter;

import dev.m.EmailSender;
import dev.m.User;
import dev.m.UserRepository;

public class UserServiceSetter {
    // loose coupling qua Setter
    private EmailSender emailSender;
    // loose coupling qua Setter
    private UserRepository userRepository;

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user) {
        userRepository.add(user);
        emailSender.sendEmail(user.getEmail(), user.getTitle());
    }
}
