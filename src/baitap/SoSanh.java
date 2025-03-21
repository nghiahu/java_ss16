/*
 - 1. for loop
- Ưu điểm
+Cho phép truy cập phần tử theo chỉ mục (phù hợp khi cần thay đổi giá trị phần tử).
+Hiệu suất cao vì không cần tạo Iterator hoặc Stream.
+Hỗ trợ cả `List` và `Array`.
- Nhược điểm
+ Cú pháp dài, dễ sai sót khi quên cập nhật chỉ mục (`i++`).
+ Không hoạt động tốt với `Iterator` hoặc `Collection` không hỗ trợ truy cập theo chỉ mục.

-- Khi nào sử dụng?
-> Khi cần truy cập phần tử theo chỉ mục hoặc cần thay đổi giá trị phần tử trong danh sách.

--------------------------------------

- 2. Enhanced for loop (foreach)
- Ưu điểm
+ Cú pháp ngắn gọn, dễ đọc hơn so với `for`.
+ Tránh lỗi `IndexOutOfBoundsException` khi duyệt danh sách.

- Nhược điểm
+ Không thể thay đổi giá trị phần tử trực tiếp.
+ Không hỗ trợ duyệt ngược hoặc bỏ qua phần tử cụ thể.

-- Khi nào sử dụng?
--> Khi chỉ cần đọc giá trị phần tử mà không cần thay đổi nó.

------------------------------------------

 - 3. Iterator
- Ưu điểm
+ Có thể xóa phần tử trong quá trình duyệt (`iterator.remove()`).
+ Hữu ích khi làm việc với Collection không hỗ trợ chỉ mục (ví dụ `Set`).
- Nhược điểm
+ Cú pháp dài, phức tạp hơn `forEach`.
+ Không thể truy cập phần tử theo chỉ mục.

- Khi nào sử dụng?
--> Khi cần xóa phần tử trong quá trình duyệt danh sách.
--> Khi làm việc với `Collection` như `Set` hoặc `Queue`.

---------------------------------------------------

-  4. Stream API (Java 8)
- Ưu điểm
+ Cú pháp ngắn gọn, dễ đọc.
+ Hỗ trợ xử lý dữ liệu song song (`parallelStream()`), tối ưu hiệu suất.
+ Có thể kết hợp với các toán tử như `filter()`, `map()`, `reduce()`,...

- Nhược điểm
+ Chỉ sử dụng để đọc dữ liệu, không thể thay đổi giá trị phần tử trực tiếp.
+ Có thể tốn tài nguyên nếu dùng với tập dữ liệu nhỏ không cần thiết.

 - Khi nào sử dụng?
--> Khi cần xử lý dữ liệu theo phong cách lập trình hàm.
--> Khi cần xử lý dữ liệu song song để tối ưu hiệu suất.

----------------------

  **So sánh hiệu suất**

for: Tốt nhất cho mảng và danh sách có chỉ mục
foreach: Gọn hơn `for`, nhưng không tối ưu bằng
Iterator: Duyệt tốt với `Set` và có thể xóa phần tử
Stream: (với `parallelStream()`) | Tốt nhất khi xử lý dữ liệu lớn hoặc song song

-----------------------

*Nên dùng phương pháp nào?*

Cần truy cập phần tử theo chỉ mục --> for
Chỉ cần đọc dữ liệu, không sửa đổi --> foreach
Cần xóa phần tử trong lúc duyệt --> Iterator
Cần xử lý dữ liệu lớn theo kiểu lập trình hàm --> Stream
*/