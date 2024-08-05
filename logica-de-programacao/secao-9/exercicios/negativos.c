#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int n, i, vet[9];

    printf("Quantos numeros voce vai digitar: ");
    scanf("%i", &n);

    for (i = 0; i < n; i++){
        printf("Digite um numero: ");
        scanf("%i", &vet[i]);
    }

    printf("NUMEROS NEGATIVOS:\n");

    for (i = 0; i < n; i++){
        if (vet[i] < 0){
            printf("%i\n", vet[i]);
        }
    }
    
    return 0;
}