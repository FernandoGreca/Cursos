#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int i, n;
    double media, soma, cont, vet[10];

    n = 0;
    i = 0;
    media = 0;
    soma = 0;
    cont = 0;

    printf("Quantos numeros voce vai digitar: ");
    scanf("%i", &n);

    for (i = 0; i < n; i++){
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
        soma = soma + vet[i];
        cont = cont + 1;
    }

    printf("\n");

    printf("VALORES = ");
    for (i = 0; i < n; i++){ 
        printf("%.2lf ", vet[i]);
    }
    
    printf("\n");

    printf("SOMA = %.2lf\n", soma);


    media = soma / cont;

    printf("MEDIA = %.2lf", media);
    
    return 0;
}