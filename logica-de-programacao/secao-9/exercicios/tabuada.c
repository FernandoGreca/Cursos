#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main(){


    int i, tabuada, resultado;

    resultado = 0;
    i = 0;
    tabuada = 0;

    printf("Deseja a tabuada para qual valor: ");
    scanf("%i", &tabuada);

    for (i = 1; i < 11; i++){
        resultado = tabuada * i ;
        printf("%i x %i = %i \n", tabuada, i, resultado);
    }
    
    return 0;
}