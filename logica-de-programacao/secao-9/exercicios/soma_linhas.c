#include <stdio.h>


int main(){

    int linhas, colunas;
    int i, j;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &linhas);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &colunas);

    double matriz[linhas][colunas];

    for (int i = 0; i < linhas; i++){
        printf("Digite os elementos da %d linha: \n", i+1);
        for (int j = 0; j < colunas; j++){
            scanf("%lf", &matriz[i][j]);
        }
    }

    double vet[linhas];

    for (int i = 0; i < linhas; i++){
        for (int j = 0; j < colunas; j++){
            vet[i] = vet[i] + matriz[i][j];
        }
    }

    printf("Vetor Gerado: \n");

    for (int i = 0; i < linhas; i++){
        printf("%.1lf\n", vet[i]);  
    }
     

    return 0;
}