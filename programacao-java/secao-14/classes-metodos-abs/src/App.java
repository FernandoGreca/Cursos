import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number fo shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c): ");
            char resp = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (resp == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            }
            else if (resp == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(shape);
        }

        sc.close();
    }
}
