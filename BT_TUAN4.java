import java.util.Scanner;

public class BT_TUAN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BAI THUC HANH TUAN 4: CAU LENH DIEU KIEN ===");

        // Nhập thông tin sách
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
        System.out.println("=== KET QUA KIỂM TRA VÀ PHÂN LOẠI ===");

        boolean hopLe = true;
        if (donGia <= 0) {
            System.out.println("- Kiem tra gia: Khong hop le (gia phai > 0)");
            hopLe = false;
        } else {
            System.out.println("- Kiem tra gia: Hop le");
        }

        if (soLuong < 0) {
            System.out.println("- Kiem tra so luong: Khong hop le (so luong phai >= 0)");
            hopLe = false;
        } else {
            System.out.println("- Kiem tra so luong: Hop le");
        }

        if (namXuatBan <= 0 || namXuatBan > 2026) {
            System.out.println("- Kiem tra nam xuat ban: Khong hop le");
            hopLe = false;
        } else {
            System.out.println("- Kiem tra nam xuat ban: Hop le");
        }

        if (hopLe) {
           
            String phanLoaiGia = "";
            if (donGia < 50000) {
                phanLoaiGia = "Sach gia thap";
            } else if (donGia <= 100000) {
                phanLoaiGia = "Sach gia trung binh";
            } else if (donGia <= 200000) {
                phanLoaiGia = "Sach gia cao";
            } else {
                phanLoaiGia = "Sach gia dac biet";
            }
            System.out.println("- Phan loai gia: " + phanLoaiGia);

        
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
        } else {
            System.out.println("\n=> Thong tin sach khong hop le, khong the thuc hien phan loai!");
        }

        sc.close();
    }
}