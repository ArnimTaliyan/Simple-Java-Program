import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        System.out.println("Enter numbers to find sum");
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sum.nextFloat();
        System.out.println("Enter second number");
        float b = sum.nextFloat();
        System.out.println("Enter third number:");
        float c = sum.nextFloat();
        float add = a + b + c;
        System.out.print("Sum of three numbers is: ");
        System.out.println(add);
    }
}