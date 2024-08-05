#include <stdio.h>


int main(){

    int ordem, i, j, negativos;

    ordem = 0;
    i = 0;
    j = 0;
    negativos = 0;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &ordem);

    int matriz[ordem][ordem];

    for (int i = 0; i < ordem; i++){
        for (int j = 0; j < ordem; j++){
            printf("Elemento [%d, %d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("Diagonal principal: \n");

    for (int i = 0; i < ordem; i++){
       printf("%d ", matriz[i][i]);
    }

    for (int i = 0; i < ordem; i++){
        for (int j = 0; j < ordem; j++){            
            if (matriz[i][j] < 0){
                negativos = negativos + 1;
            }  
        }
    }

    printf("\nQuantidades de negativos = %d", negativos);
    

    return 0;
}