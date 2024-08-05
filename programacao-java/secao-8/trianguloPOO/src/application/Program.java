package trianguloPOO.src.application;
import java.util.Locale;
import java.util.Scanner;

import trianguloPOO.src.entities.Tringulo;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Tringulo x, y;
        x = new Tringulo();
        y = new Tringulo();

        System.out.println("Coloque as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Coloque as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area triangulo x: %.4f%n", areaX);
        System.out.printf("Area triangulo y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area e do triangulo: X");
        }
        else {
            System.out.println("A maior area e do triangulo: Y");
        }
        
        sc.close();

    }
}