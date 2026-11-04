import java.util.ArrayList;
import java.util.Scanner;

public class BT_TUAN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        int[] soLuong = new int[5];
        boolean daNhapSoLuong = false;

        ArrayList<String> danhSachSach = new ArrayList<>();

        do {
            System.out.println("\n========== QUẢN LÝ THƯ VIỆN - TUẦN 6 ==========");
            System.out.println("1. Thêm sách vào danh sách (ArrayList)");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Xóa sách khỏi danh sách");
            System.out.println("5. Sửa thông tin sách");
            System.out.println("6. Nhập & tính tổng số lượng sách (Mảng Bài 1)");
            System.out.println("7. Tính tổng giá trị (hoặc thống kê mở rộng)");
            System.out.println("8. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (1-8): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("\nNhập thông tin/tên cuốn sách cần thêm: ");
                    String sachMoi = scanner.nextLine();
                    danhSachSach.add(sachMoi);
                    System.out.println("-> Thêm sách thành công!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SÁCH CÁC CUỐN SÁCH ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sách hiện đang trống!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nNhập từ khóa tên sách cần tìm: ");
                    String tuKhoa = scanner.nextLine();
                    boolean found = false;
                    System.out.println("Kết quả tìm kiếm:");
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).toLowerCase().contains(tuKhoa.toLowerCase())) {
                            System.out.println("- Vị trí " + (i + 1) + ": " + danhSachSach.get(i));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy cuốn sách nào phù hợp.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- XÓA SÁCH ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sách trống!");
                        break;
                    }
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        System.out.println((i + 1) + ". " + danhSachSach.get(i));
                    }
                    System.out.print("Nhập số thứ tự sách cần xóa: ");
                    int sttXoa = scanner.nextInt();
                    if (sttXoa > 0 && sttXoa <= danhSachSach.size()) {
                        danhSachSach.remove(sttXoa - 1);
                        System.out.println("-> Xóa thành công!");
                    } else {
                        System.out.println("Số thứ tự không hợp lệ!");
                    }
                    break;

                case 5:
                    System.out.println("\n--- SỬA THÔNG TIN SÁCH ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sách trống!");
                        break;
                    }
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        System.out.println((i + 1) + ". " + danhSachSach.get(i));
                    }
                    System.out.print("Nhập số thứ tự sách cần sửa: ");
                    int sttSua = scanner.nextInt();
                    scanner.nextLine();
                    if (sttSua > 0 && sttSua <= danhSachSach.size()) {
                        System.out.print("Nhập thông tin mới thay thế: ");
                        String thongTinMoi = scanner.nextLine();
                        danhSachSach.set(sttSua - 1, thongTinMoi);
                        System.out.println("-> Cập nhật thành công!");
                    } else {
                        System.out.println("Số thứ tự không hợp lệ!");
                    }
                    break;

                case 6:
                    System.out.println("\n--- BÀI 1: NHẬP MẢNG SỐ LƯỢNG 5 CUỐN SÁCH ---");
                    for (int i = 0; i < soLuong.length; i++) {
                        System.out.print("Nhập số lượng cho cuốn thứ " + (i + 1) + ": ");
                        soLuong[i] = scanner.nextInt();
                    }
                    daNhapSoLuong = true;
                    
                    int tongSL = 0;
                    int maxSL = soLuong[0];
                    for (int sl : soLuong) {
                        tongSL += sl;
                        if (sl > maxSL) {
                            maxSL = sl;
                        }
                    }
                    System.out.println("-> Tổng số lượng của 5 cuốn: " + tongSL);
                    System.out.println("-> Số lượng lớn nhất trong mảng: " + maxSL);
                    break;

                case 7:
                    if (!daNhapSoLuong) {
                        System.out.println("Bạn chưa nhập mảng số lượng ở chức năng 6!");
                        break;
                    }
                    System.out.println("\n--- THỐNG KÊ SỐ LƯỢNG HIỆN TẠI ---");
                    int tong = 0;
                    for (int i = 0; i < soLuong.length; i++) {
                        System.out.println("Cuốn " + (i + 1) + ": " + soLuong[i] + " quyển");
                        tong += soLuong[i];
                    }
                    System.out.println("Tổng cộng kho sách: " + tong + " quyển.");
                    break;

                case 8:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}