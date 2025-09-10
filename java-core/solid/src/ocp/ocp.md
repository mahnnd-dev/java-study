## Open/Closed Principle (OCP)

**Định nghĩa**  
Nguyên lý này phát biểu rằng các thực thể phần mềm (**class**, **module**, **hàm**, v.v.) nên được **mở để mở rộng** nhưng **đóng để sửa đổi**.

---

### 💡 Ý tưởng chính

Khi bạn muốn thêm hành vi (behavior) mới cho một class, **hãy mở rộng nó**, **không sửa đổi mã nguồn gốc**.

Việc tuân theo OCP giúp:

- Hạn chế rủi ro khi thay đổi code đang hoạt động ổn định
- Tăng khả năng mở rộng mà không làm ảnh hưởng đến logic cũ
- Dễ dàng bảo trì và phát triển tính năng mới

---

### ❌ Vi phạm OCP

Giả sử bạn có một class `InvoicePrinter` in hóa đơn theo định dạng PDF.  
Khi có yêu cầu in thêm định dạng Excel, bạn **sửa đổi class cũ** để xử lý Excel luôn → Vi phạm OCP.

```java
class InvoicePrinter {
    public void print(String format) {
        if (format.equals("PDF")) {
            // in PDF
        } else if (format.equals("EXCEL")) {
            // in Excel
        }
    }
}
