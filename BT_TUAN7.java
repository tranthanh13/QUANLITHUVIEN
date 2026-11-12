import java.util.ArrayList;

class Sach {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    public Sach() {}

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
        Sach sach1 = new Sach("B01", "Lập trình Java căn bản", "Nguyễn Văn A", 2023, 10);
        sach1.hienThiThongTin();

        ArrayList<Sach> danhSachSach = new ArrayList<>();
        danhSachSach.add(sach1);
        danhSachSach.add(new Sach("B02", "Cấu trúc dữ liệu", "Trần Văn B", 2022, 5));

        System.out.println("=== DANH SÁCH SÁCH THƯ VIỆN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}