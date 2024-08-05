import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);   

        System.out.print("Numero de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Numero de colunas: ");
        int colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int numeroProcurado = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == numeroProcurado) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j-1 >= 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j+1 < colunas) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i+1 < linhas) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    if (i-1 >= 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
