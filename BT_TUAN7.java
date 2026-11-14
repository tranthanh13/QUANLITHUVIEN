import java.util.ArrayList;
import java.util.Calendar;

class Sach {
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
        setNamXuatBan(namXuatBan); 
        setSoLuong(soLuong);       
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
            System.out.println("Lỗi: Năm xuất bản (" + namXuatBan + ") không hợp lệ! Mặc định gán năm hiện tại (" + currentYear + ").");
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
            System.out.println("Lỗi: Số lượng (" + soLuong + ") không được âm! Mặc định gán bằng 0.");
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

public class BT_TUAN7 {
    public static void main(String[] args) {
        System.out.println("=== QUẢN LÝ SÁCH - BÀI THỰC HÀNH TUẦN 8 ===");
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        Sach sach1 = new Sach("B01", "Lập trình Java", "Nguyễn Văn A", 2022, 5);
        
        Sach sach2 = new Sach("B02", "Cấu trúc dữ liệu", "Trần Văn B", 2030, -3);

        danhSachSach.add(sach1);
        danhSachSach.add(sach2);

        System.out.println("\nDanh sách sách sau khi kiểm tra:");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}