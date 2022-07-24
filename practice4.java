import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        System.out.println("Result");
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter marks of Java:");
        float a = sub.nextFloat();
        System.out.println("Enter marks of DAA:");
        float b = sub.nextFloat();
        System.out.println("Enter marks of DevOps:");
        float c = sub.nextFloat();
        float cgpa = (a + b + c)/30;
        System.out.print("Your CGPA is: ");
        System.out.println(cgpa);
    }
}