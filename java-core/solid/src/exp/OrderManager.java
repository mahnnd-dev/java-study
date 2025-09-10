package exp;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    public void processOrder(Order order) {
        // Validate order
        if (order.getItems() == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }

        // Calculate total price
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        // Apply discount
        if (order.getCustomerType().equals("VIP")) {
            total *= 0.9; // 10% discount
        }

        // Save to database
        Database db = new Database();
        db.connect();
        db.saveOrder(order, total);
        db.disconnect();

        // Send email notification
        EmailService emailService = new EmailService();
        emailService.sendEmail(order.getCustomerEmail(), "Your order has been processed!");
    }
    List list = new ArrayList();
}

