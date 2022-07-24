import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {
        Scanner dist = new Scanner(System.in);
        System.out.println("Enter distance in kilometer:");
        double distance = dist.nextDouble();
        double miles = (distance)/1.609;
        System.out.println("Distance is: " + miles);
    }
}