import java.util.Scanner;

public class convertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD cần đổi ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.printf("%.0f%s",vnd, "VNĐ");
    }
}
