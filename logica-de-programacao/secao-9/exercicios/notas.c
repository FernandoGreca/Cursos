#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main(){

    double nota1, nota2, soma;

    nota1 = 0;
    nota2 = 0;
    soma = 0;

    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);

    printf("Digite a segunda nota: ");
    limpar_entrada();
    scanf("%lf", &nota2);

    soma = nota1 + nota2;

    printf("NOTA FINAL = %.1lf\n", soma);

    if (soma < 60){
        printf("REPROVADO");
    }
    

    return 0;
}