## Dependency Inversion Principle (DIP)

**Định nghĩa**  
Nguyên lý này có hai điểm cốt lõi:

1. **Module cấp cao không nên phụ thuộc vào module cấp thấp** — cả hai nên phụ thuộc vào **abstraction**.
2. **Abstraction không phụ thuộc vào chi tiết triển khai** — mà **chi tiết** phải phụ thuộc vào **abstraction**.

---

### 💡 Ý tưởng chính

- Module cấp cao (High-level module): chứa logic nghiệp vụ chính.
- Module cấp thấp (Low-level module): thực hiện chi tiết kỹ thuật như truy xuất cơ sở dữ liệu, gửi email...
- DIP giúp **tách biệt rõ ràng giữa logic nghiệp vụ và chi tiết kỹ thuật**, từ đó giảm **coupling** và tăng **tính linh hoạt, dễ bảo trì**.

---

### ❌ Vi phạm DIP

```java
class EmailService {
    public void sendEmail(String message) {
        // gửi email
    }
}

class NotificationManager {
    private EmailService emailService = new EmailService();

    public void notify(String message) {
        emailService.sendEmail(message);
    }
}
