## Single Responsibility Principle (SRP)

**Định nghĩa**  
Nguyên lý này đề cập đến việc **một class chỉ nên có một trách nhiệm duy nhất**. Mục tiêu là khi class đó thay đổi, sự ảnh hưởng của nó lên chương trình là ít nhất vì nó chỉ chịu trách nhiệm cho một việc cụ thể.

---

### 🚫 Vi phạm SRP

**Class vi phạm:** `OrderManager` đang đảm nhiệm quá nhiều trách nhiệm:

- Xác thực đơn hàng (`validate order`)
- Tính toán tổng giá (`calculate total price`)
- Áp dụng giảm giá (`apply discount`)
- Lưu vào cơ sở dữ liệu (`save to database`)
- Gửi email thông báo (`send email notification`)

**Vấn đề:**  
Nếu một trong các logic như xác thực, tính giá, hoặc gửi email thay đổi, bạn buộc phải sửa đổi `OrderManager`. Điều này dẫn đến:

- Khó bảo trì
- Khó mở rộng
- Dễ sinh lỗi khi chỉnh sửa

---

### ✅ Giải pháp: Tách các trách nhiệm

Tách từng nhiệm vụ thành các class riêng biệt:

- `OrderValidator`: Xác thực đơn hàng
- `PriceCalculator`: Tính toán tổng giá
- `DiscountPolicy`: Áp dụng giảm giá
- `OrderRepository`: Lưu đơn hàng vào cơ sở dữ liệu
- `NotificationService`: Gửi thông báo email

> Mỗi class chỉ chịu trách nhiệm **duy nhất một việc**, giúp hệ thống dễ bảo trì, mở rộng và kiểm thử hơn.

---

**Tóm lại:**  
SRP giúp bạn **giảm phụ thuộc**, **tăng khả năng tái sử dụng** và **dễ dàng quản lý thay đổi** trong hệ thống.
