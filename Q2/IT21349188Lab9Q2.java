import java.util.Scanner;
import java.util.Scanner;

public class IT21349188Lab9Q2 {

    // method to calculate area
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double area = circleArea(r);

        System.out.println("The area of the circle with radius " + r + " is : " + area);

        sc.close();
    }
}