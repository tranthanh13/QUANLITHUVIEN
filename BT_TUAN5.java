import java.util.Scanner;

public class BT_TUAN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        String[] maSach = null;
        int[] soLuong = null;
        double[] giaTri = null;
        boolean daNhap = false;
        
        int chon = 0;
        do {
            System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Nhập danh sách sách");
            System.out.println("2. Xem tổng số lượng và tổng giá trị");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            chon = sc.nextInt();
            sc.nextLine();
            
            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng sách: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    
                    maSach = new String[n];
                    soLuong = new int[n];
                    giaTri = new double[n];
                    
                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Nhập sách thứ " + (i + 1) + " ---");
                        System.out.print("Mã sách: ");
                        maSach[i] = sc.nextLine();
                        System.out.print("Số lượng: ");
                        soLuong[i] = sc.nextInt();
                        System.out.print("Đơn giá: ");
                        giaTri[i] = sc.nextDouble();
                        sc.nextLine();
                    }
                    daNhap = true;
                    System.out.println("-> Đã nhập xong dữ liệu!");
                    break;
                    
                case 2:
                    if (!daNhap) {
                        System.out.println("-> Bạn chưa nhập dữ liệu sách (chọn 1 trước nhé).");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;
                        for (int i = 0; i < n; i++) {
                            tongSoLuong += soLuong[i];
                            tongGiaTri += (soLuong[i] * giaTri[i]);
                        }
                        System.out.println("-> Tổng số lượng sách: " + tongSoLuong);
                        System.out.println("-> Tổng giá trị sách: " + tongGiaTri);
                    }
                    break;
                    
                case 3:
                    if (!daNhap) {
                        System.out.println("-> Bạn chưa nhập dữ liệu sách (chọn 1 trước nhé).");
                    } else {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String timMa = sc.nextLine();
                        boolean timThay = false;
                        for (int i = 0; i < n; i++) {
                            if (maSach[i].equalsIgnoreCase(timMa)) {
                                System.out.println("-> Tìm thấy: Mã = " + maSach[i] 
                                    + " | Số lượng = " + soLuong[i] 
                                    + " | Đơn giá = " + giaTri[i]);
                                timThay = true;
                                break;
                            }
                        }
                        if (!timThay) {
                            System.out.println("-> Không tìm thấy mã sách này.");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("-> Đã thoát chương trình.");
                    break;
                    
                default:
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 4.");
            }
        } while (chon != 4);
    }
}