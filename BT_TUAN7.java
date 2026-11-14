import java.util.ArrayList;

class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
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
        System.out.println("=== DANH SÁCH SÁCH TUẦN 7 ===");
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        
        Sach sach1 = new Sach("B01", "Lập trình Java", "Nguyễn Văn A", 2022, 5);
        Sach sach2 = new Sach("B02", "Cấu trúc dữ liệu", "Trần Văn B", 2023, 8);
        
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);

        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}