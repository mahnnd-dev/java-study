## Interface Segregation Principle (ISP)

**Định nghĩa**  
Nguyên lý này phát biểu rằng:
> **Client không nên bị ép buộc phụ thuộc vào những interface mà nó không sử dụng.**

---

### 💡 Ý tưởng chính

- Thay vì tạo một interface lớn với nhiều phương thức không liên quan, hãy **tách nhỏ chúng thành các interface chuyên biệt hơn**.
- Nguyên lý này rất giống với **SRP**, nhưng áp dụng cho interface thay vì class.

---

### ❌ Vi phạm ISP

Giả sử bạn có một interface `Machine` như sau:

```java
interface Machine {
    void print();
    void scan();
    void fax();
}
