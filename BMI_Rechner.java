import java.util.Scanner;
public class BMI_Rechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi;
        double height;
        double weight;

        System.out.print("Put in your height in cm: ");
        height = sc.nextDouble();
        System.out.print("Put in your weight: ");
        weight = sc.nextDouble();
        bmi = calculateBMI(height, weight);
        System.out.println("Your BMI is: " + bmi);

    }
    public static double calculateBMI(double height, double weight) {
        double bmi;
        height = (height * height) / 100;
        bmi = weight / height * 100;
        return bmi;
    }
}
