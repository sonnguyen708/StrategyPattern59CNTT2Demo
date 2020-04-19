# StrategyPattern59CNTT2Demo
Bài tập 1: Cài đặt các lớp trong sơ đồ sau đây theo mẫu Stratery Pattern
2. Viết mã lệnh cho các lớp trong sơ đồ trên.
3. Thực hiện việc tính toán biểu thức 75 + 12, 54 - 78 trong context.
Bài tập 2: Cài đặt các lớp sau đây theo mẫu Stratery Pattern
+ Interface IThanhToan: Khai báo phương thức thanh toán trả về số tiền thanh toán
dựa trên giá trị hàng hoá đã mua.
+ Lớp ThanhToanOnline: Thực thi interface IThanhToan. Nếu tiền hàng <1.000.000
thì khách hàng được giảm 5%, ngược lại khách hàng được giảm 7%.
+ Lớp ThanhToanCOD: Thực thi giao diện IThanhToan, khách hàng chỉ được giảm
2% nếu tiền mua hàng > 2.000.000.
+ Lớp GioHang: Chứa một đối tượng hinhThucTT kiểu IThanhToan và một danh sách
các hàng hoá. Phương thức thanhToan tính toán tiền cho giỏ hàng dựa vào sự hỗ trợ
của đối tượng hinhThucTT.
+ Hàm main của lớp thực thi khởi tạo hai giỏ hàng với hai hình thức thanh toán khác
nhau, in ra màn hình danh sách hàng hoá, tiền hàng, số tiền khách phải trả.
Tinh
+ tinh (float a, float b) : float
Cong
+ <<Implement>> tinh (float a, float b) : float
Tru
+ <<Implement>> tinh (float a, float b) : float
Nhan
+ <<Implement>> tinh (float a, float b) : float
Chia
+ <<Implement>> tinh (float a, float b) : float
context
- tinhToan : Tinh
+
+
setTinhToan (Tinh tinhToan)
tinh (float a, float b)
: void
: float 1..1
1..1
Bài tập 3: Cài đặt các lớp sau đây theo mẫu Stratery Pattern
+ Interface ISoSanh khai báo phương thức soSanh:
- Nếu o1>o2: trả về giá trị 1
- Nếu o1 = o2: trả về giá trị 0
- Nếu o1<o2: trả về giá trị -1
+ Hai lớp SoSanhTheoTen và SoSanhTheoDiem thực thi giao diện ISoSanh.
+ Lớp QLSV chứa danh sách các đối tượng SinhVien và một đối tượng ISoSanh.
- Phương thức sapXep() thực hiện công việc sắp xếp danh sách các đối tượng
SinhVien.
- Phương thức inDS thực hiên công viên in danh sách sinh viên ra màn hình.
+ Hàm main của lớp thực thực hiện công việc:
- Tạo một đối tượng QLSV và một danh sách các SinhVien của đối tượng QLSV.
- Thực hiện công việc sắp xếp danh sách sinh viên theo tên và in danh sách này
ra màn hinh.
- Thực hiện công việc sắp xếp danh sách sinh viên theo điểm và in danh sách này
ra màn hình.
