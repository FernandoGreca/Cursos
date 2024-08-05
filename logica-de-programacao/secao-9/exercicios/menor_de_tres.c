#include <stdio.h>
#include <math.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main(){

    int a, b, c, menor; 

    printf("Primeiro valor: ");
    scanf("%i", &a);

    printf("Segundo valor: ");
    limpar_entrada();
    scanf("%i", &b);

    printf("Terceiro valor: ");
    limpar_entrada();
    scanf("%i", &c); 

    if (a < b && a < c) {
        menor = a;

    }
    else if (b < c){
        menor = b;
    }
    else {
        menor = c;
    }
    

    printf("MENOR = %i", menor); 
    

    return 0;
}