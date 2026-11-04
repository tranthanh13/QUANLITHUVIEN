import java.util.Scanner;

public class BT_TUAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== NHAP THONG TIN SACH VA PHAN LOAI (TUAN 4) ===");
        
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

        System.out.print("Nhap so luong ton kho: ");
        int soLuong = sc.nextInt();

        System.out.println("\n-----------------------------------");
        System.out.println("=== KET QUA PHAN LOAI ===");

        // 1. Phân loại tồn kho (Dựa trên ý tưởng sửa từ Bài 3)
        String phanLoaiTonKho = "";
        if (soLuong == 0) {
            phanLoaiTonKho = "Het sach";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }
        System.out.println("- Phan loai ton kho: " + phanLoaiTonKho);

        // 2. Chọn loại sách dùng switch-case (Yêu cầu Bài 4)
        System.out.println("\n--- Chon loai sach ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Chon loai sach (1-4): ");
        int loaiSachChon = sc.nextInt();

        String tenLoaiSach = "";
        switch (loaiSachChon) {
            case 1:
                tenLoaiSach = "Sach giao khoa";
                break;
            case 2:
                tenLoaiSach = "Sach tham khao";
                break;
            case 3:
                tenLoaiSach = "Sach chuyen nganh";
                break;
            case 4:
                tenLoaiSach = "Sach khac";
                break;
            default:
                tenLoaiSach = "Loai sach khong hop le";
                break;
        }
        System.out.println("- Loai sach da chon: " + tenLoaiSach);

        sc.close();
    }
}