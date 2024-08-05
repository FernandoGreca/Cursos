#include <stdio.h>


void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}


int main(){

    int n1, n2;
    
    printf("Digite dois numeros: \n");
    scanf("%i", &n1);
    limpar_entrada();
    scanf("%i", &n2);

    while (n1 != n2)
    {
        if (n1 < n2){
            printf("CRESCENTE!!\n");
        }
        else{
            printf("DECRESCENTE!\n");
        }

        printf("Digite dois numeros: \n");
        scanf("%i", &n1);
        limpar_entrada();
        scanf("%i", &n2);
    }
    
    
    return 0;
}