#include <stdio.h>

int main() {

    char nome[50];
    char sexo;
    double salario;
    int idade; 

    strcpy (nome, "Maria Rita");
    sexo = 'F';
    salario = 4560.9;
    idade = 18;

    printf("A funcionaria %s, sexo %c, ganha %.2lf e tem %i anos", nome, sexo, salario, idade);

    return 0; 
}