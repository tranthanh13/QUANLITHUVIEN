import java.util.Scanner;

public class BT_TUAN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bài 1: Nhập thông tin một cuốn sách
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();

        // Bài 2: Tính thành tiền = đơn giá * số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách (thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả ra màn hình
        System.out.println("\n=== THÔNG TIN VÀ GIÁ TRỊ NHẬP KHO ===");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("-------------------------------------");
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen);
        System.out.println("Tổng tiền nhập kho: " + tongTienNhap);

        scanner.close();
    }
}