import java.util.Scanner;
public class practice2{
    public static void main(String[] args) {
        System.out.println("CBSE Result");
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter marks of Mathematics:");
        float a = sub.nextFloat();
        System.out.println("Enter marks of Physics:");
        float b = sub.nextFloat();
        System.out.println("Enter marks of Java:");
        float c = sub.nextFloat();
        System.out.println("Enter marks of Data Structures:");
        float d = sub.nextFloat();
        System.out.println("Enter marks of CSA");
        float e = sub.nextFloat();
        float SumOfNumbers = a+b+c+d+e;
        float AvgOfNumbers = SumOfNumbers/500;
        float percentage = AvgOfNumbers*100;
        System.out.print("Your percentage is: ");
        System.out.println(percentage);
    }
}