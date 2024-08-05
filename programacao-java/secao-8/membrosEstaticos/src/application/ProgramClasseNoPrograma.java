import java.util.Locale;
import java.util.Scanner;

public class ProgramClasseNoPrograma {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.println("Circunference: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("Value PI: " + String.format("%.2f", PI));

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
    }
}