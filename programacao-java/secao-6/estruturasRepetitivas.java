import java.util.Random;

public class estruturasRepetitivas {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroInteiro;

        numeroInteiro = random.nextInt(20);

        while (numeroInteiro != 2) {
            System.out.println(numeroInteiro);
            numeroInteiro = random.nextInt(20);
        }
        System.out.println("Finalmente ficou igual a 2");

        for (int i = 0; i < 10; i += 1) {
            System.out.println(i);
        }

        numeroInteiro = random.nextInt(20);
        do {
            System.out.println(numeroInteiro);
            numeroInteiro = random.nextInt(20);
        } while (numeroInteiro != 2);
        System.out.println("Finalmente ficou igual a 2");
    }
}