import java.util.Scanner;

public class TestBT_TUAN8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CHƯƠNG TRÌNH TEST BÀI TẬP TUẦN 8 ===");
        
        System.out.print("Nhập tiêu đề hoặc mã sách kiểm thử: ");
        String tenSach = scanner.nextLine();
        
        System.out.println("-> Đã nhận dữ liệu test thành công cho sách: " + tenSach);
        
        scanner.close();
    }
}