public class estruturaCondicional{
    public static void main(String[] args){

        // operador 'e' é representado da seguinte forma "&&"
        // operador 'ou' é representado da seguinte forma "||"
        // operador 'nao' é representado da seguinte fomra "!"

        int idade, x;
        String a, dia;

        x = 1;
        idade = 18;
        a = "Boa tarde";

        if (idade < 18) {
            System.out.println("Voce ainda nao pode tirar a carteira de habilitacao");
        } 
        else {
            System.out.println("Voce pode tirar sua carteira de habilitacao!!!");
        }

        if (a == "Bom dia") {
            System.out.println("Está de manha!");
        }
        else if (a == "Boa tarde") {
            System.out.println("Está de tarde!!");
        } 
        else if (a == "Boa noite") {
            System.out.println("Está de noite!!!");
        }

        switch (a) {
            case "Bom dia":
                System.out.println("Está de manha!");
                break;
            case "Boa tarde":
                System.out.println("Está de tarde!!");
                break;
            case "Boa noite":
                System.out.println("Está de noite!!!");
                break;
        }

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor Inválido";
                break;
        }

        System.out.println("Hoje e = " + dia);
    }
}