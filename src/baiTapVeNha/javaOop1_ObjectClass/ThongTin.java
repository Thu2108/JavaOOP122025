package baiTapVeNha.javaOop1_ObjectClass;

import java.sql.SQLOutput;

// - Tạo project mới làm bài tập phần Java OOP
// - Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
// - Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
// - Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên
public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        System.out.println(nhanVien.Hoten);
        System.out.println(nhanVien.Tuoi);
        System.out.println(nhanVien.BoPhan);
    }
}
