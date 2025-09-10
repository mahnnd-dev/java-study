package dev.m.contructor;

import dev.m.EmailSender;
import dev.m.User;
import dev.m.UserRepository;

public class UserServiceContructor {
    // loose coupling qua contructor
    private final EmailSender emailSender;
    // loose coupling qua contructor
    private final UserRepository userRepository;

    public UserServiceContructor(EmailSender emailSender, UserRepository userRepository) {
        this.emailSender = emailSender;
        this.userRepository = userRepository;
    }

    public void register(User user) {
        userRepository.add(user);
        emailSender.sendEmail(user.getEmail(), user.getTitle());
    }
}
