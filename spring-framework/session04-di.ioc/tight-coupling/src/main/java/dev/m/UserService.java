package dev.m;

public class UserService {

    // Tight coupling
    private EmailSender emailSender = new EmailSender();
    // Tight coupling
    private UserRepository userRepository = new UserRepository();

    public void register(User user) {
        userRepository.add(user);
        emailSender.sendEmail(user.getEmail(), user.getTitle());
    }
}
