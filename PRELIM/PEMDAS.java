import java.util.Scanner;

public class PEMDAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        double result = (num1 * num2) + (num3 / (num1 - num2));

        System.out.println("Result: " + result);
    }
}