import java.util.ArrayList;

public class TestBT_TUAN7 {
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