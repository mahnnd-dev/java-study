## Liskov Substitution Principle (LSP)

**Định nghĩa**  
Nguyên lý thay thế Liskov phát biểu rằng:  
**Một lớp con phải có khả năng thay thế lớp cha mà không làm thay đổi tính đúng đắn của chương trình.**

---

### 💡 Ý tưởng chính

- Khi bạn kế thừa một lớp, **lớp con phải giữ nguyên hợp đồng (contract)** mà lớp cha đã đưa ra.
- Mọi nơi đang sử dụng lớp cha, nếu thay bằng lớp con thì chương trình **vẫn phải hoạt động chính xác**.

---

### ❌ Vi phạm LSP

Giả sử có class `Bird` với phương thức `fly()`. Bạn tạo subclass `Penguin` kế thừa `Bird`, nhưng chim cánh cụt không biết bay → Vi phạm LSP.

```java
class Bird {
    public void fly() {
        // bay trên trời
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
