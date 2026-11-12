import java.util.ArrayList;
import java.util.Calendar;
class Sach {
    // Khai báo các thuộc tính với từ khóa private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); // Gọi setter để kiểm tra ràng buộc năm
        setSoLuong(soLuong);       // Gọi setter để kiểm tra ràng buộc số lượng
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ! Mặc định gán bằng năm hiện tại.");
            this.namXuatBan = currentYear;
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không thể âm! Mặc định gán bằng 0.");
            this.soLuong = 0;
        }
    }
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("-----------------------------------");
    }
}
public class BT_TUAN8 {
    public static void main(String[] args) {
        System.out.println("=== KIỂM TRA ĐỐI TƯỢNG HỢP LỆ ===");
        Sach sach1 = new Sach("B01", "Lập trình Java căn bản", "Nguyễn Văn A", 2023, 10);
        sach1.hienThiThongTin();

        ArrayList<Sach> danhSachSach = new ArrayList<>();
        danhSachSach.add(sach1);
        
        System.out.println("=== KIỂM TRA RÀNG BUỘC DỮ LIỆU ===");
        // Thử nghiệm truyền năm tương lai và số lượng âm để kích hoạt cơ chế ràng buộc
        Sach sach2 = new Sach("B02", "Cấu trúc dữ liệu", "Trần Văn B", 2030, -5); 
        danhSachSach.add(sach2);

        System.out.println("\n=== DANH SÁCH SÁCH THƯ VIỆN SAU KHI CẬP NHẬT ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}