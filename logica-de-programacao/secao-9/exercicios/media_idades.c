#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int idade, soma, cont;
    double media;

    idade = 0;
    media = 0;
    soma = 0;
    cont = 0;

    printf("Digite as idades:\n");
    scanf("%i", &idade);

    while (idade >= 0){
        soma = soma + idade;
        cont = cont + 1;

        scanf("%i", &idade);
    }

    if (cont > 0){
        media = (double)soma / cont;
        printf("MEDIA = %.2lf", media);
    }
    else{
        printf("IMPOSSIVEL CALCULAR");
    }

    return 0;
}