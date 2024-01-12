import java.util.Scanner;

public class thuchanh7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập cân nặng: ");
        double weight = sc.nextDouble();;
        System.out.println("Vui lòng nhập chiều cao: ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height,2);
        System.out.println("BMI của bạn là: " +bmi);
        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
