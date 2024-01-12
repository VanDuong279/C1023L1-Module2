import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        double rate = 23000.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số tiền USD: ");
        double usd = sc.nextDouble();
        double total = usd * rate;
        System.out.println("Quy đổi ra tiền VND: " + total);
    }
}
