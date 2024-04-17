import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Hiển thị menu cho người dùng
            System.out.println("Chọn một trong các phép tính sau:");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("5. Thoát");

            // Yêu cầu người dùng chọn một phép tính
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            // Thực hiện phép tính tương ứng với lựa chọn của người dùng
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        System.out.println("Tổng: " + (num1 + num2));
    }

    public static void subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        System.out.println("Hiệu: " + (num1 - num2));
    }

    public static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        System.out.println("Tích: " + (num1 * num2));
    }

    public static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Không thể chia cho 0.");
        } else {
            System.out.println("Thương: " + (num1 / num2));
        }
    }
}
