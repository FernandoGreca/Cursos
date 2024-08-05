#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main() {

    double largura, comprimento, precom, area, valorm; 

    printf("Digite a largura do terreno: ");
    scanf("%lf", &largura);

    printf("Digite o comprimento do terreno: ");
    limpar_entrada();
    scanf("%lf", &comprimento);
    
    printf("Digite o valor do metro quadrado: ");
    limpar_entrada();
    scanf("%lf", &valorm);

    area = largura * comprimento; 

    precom = area * valorm;

    printf("Area do terreno = %.2lf\n", area);
    printf("Preco do terreno = %.2lf", precom);

    return 0;
}