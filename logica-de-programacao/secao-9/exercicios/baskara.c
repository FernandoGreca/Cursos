#include <stdio.h>
#include <math.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main(){

    double a, b, c, delta, x1, x2; 

    printf("Coeficiente a: ");
    scanf("%lf", &a);

    printf("Coeficiente b: ");
    limpar_entrada();
    scanf("%lf", &b);

    printf("Coeficiente c: ");
    limpar_entrada();
    scanf("%lf", &c);

    delta = pow(b, 2) -4 * a * c; 

    if (delta < 0){
        printf("Esta equacao nao possui raizes reais.");  
    }
    else{
        x1 = (-b +sqrt(delta)) / (2 * a);
        x2 = (-b -sqrt(delta)) / (2 * a);; 

        printf("X1 = %.4lf\n", x1);
        printf("X2 = %.4lf\n", x2);
    }
    
    

    return 0;
}