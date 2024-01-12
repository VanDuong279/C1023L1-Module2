import java.util.Scanner;

public class thuchanh4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        float a = sc.nextFloat();
        System.out.println("b: ");
        float b = sc.nextFloat();
        System.out.println("c: ");
        float c = sc.nextFloat();

        if (a != 0) {
            float total = (c - b) / a;
            System.out.println("Result: " + total);
        } else {
            if (a == 0 && b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
