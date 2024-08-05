#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int x, y, menor, maior, i, soma;

    x = 0;
    y = 0;
    menor = 0;
    maior = 0;
    i = 0;
    soma = 0;


    printf("Digite dois numeros: \n");
    scanf("%i", &x); 
    limpar_entrada();
    scanf("%i", &y); 

    if (x < y){
        menor = x;
        maior = y;
    }
    else{
        menor = y;
        maior = x;
    }
    
    if (menor % 2 == 0){
        menor = menor + 1;
    }
    else{
        menor = menor + 2;
    }
    
    if (maior % 2 != 0){
        maior = maior - 1;
    }

    for (i = menor; i < maior; i += 2){
        soma = soma + i;
    }

    printf("SOMA DOS IMPARES = %i", soma);
    

    return 0;
}