import java.util.Scanner;

public class BT_TUAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BAI THUC HANH TUAN 3: BIEN, KIEU DU LIEU VA TOAN TU ===");

        // Bài 1: Nhập thông tin sách
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        // Bài 2: Tính thành tiền = đơn giá × số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách (thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả
        System.out.println("\n-----------------------------------");
        System.out.println("=== KET QUA TINH TOAN BAI TAP TUAN 3 ===");
        System.out.println("- Ma sach: " + maSach);
        System.out.println("- Ten sach: " + tenSach);
        System.out.println("- Tac gia: " + tacGia);
        System.out.println("- Nam xuat ban: " + namXuatBan);
        System.out.println("- Don gia: " + donGia);
        System.out.println("- So luong: " + soLuong);
        System.out.println("- Thanh tien: " + thanhTien);
        System.out.println("- Phi van chuyen (5%): " + phiVanChuyen);
        System.out.println("- Tong tien nhap: " + tongTienNhap);

        sc.close();
    }
}