package base;

import java.util.Locale;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out. print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out. print("Digite o salario da primeira pessoa: ");
        Double salario1 = sc.nextDouble();
        

        System.out. print("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out. print("Digite o salario da segunda pessoa: ");
        Double salario2 = sc.nextDouble();
        

        System.out. print("Digite uma idade: ");
        int idade = sc.nextInt();
        

        System.out. print("Digite um sexo (F/M): ");
        char sexo = sc.next().charAt(0);
        

        System.out.println("Nome 1: " + nome1);
        System.out.println("Salario 1: " + String.format("%.2f", salario1));
        System.out.println("Nome 2: " + nome2);
        System.out.println("Salario 2: " + String.format("%.2f", salario2));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();
    }
}