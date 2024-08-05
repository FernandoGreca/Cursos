#include <stdio.h>
#include <math.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main() {

    double b, a, area, perimetro, diagonal;

    printf("Base do retangulo: ");
    scanf("%lf", &b);

    printf("Altura do retangulo: ");
    limpar_entrada();
    scanf("%lf", &a);

    area = b * a; 

    perimetro = (b*2) + (a*2);

    diagonal = sqrt(pow(b, 2) + pow(a, 2)); 


    printf("AREA = %.4lf\n", area);
    printf("PERIMETRO = %.4lf\n", perimetro);
    printf("DIAGONAL = %.4lf\n", diagonal);

    return 0;
}