#include <bits/stdc++.h>

using namespace std;

int main(){

    int n1, n2, menor, maior, i, soma;

    n1 = 0;
    n2 = 0;
    menor = 0;
    maior = 0;
    i = 0;
    soma = 0;

    cout << "Digite dois numeros: " << endl; 
    cin >> n1;
    cin >> n2;

    if (n1 < n2){
        menor = n1;
        maior = n2;
    }
    else if (n2 < n1){
        menor = n2;
        maior = n1;
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

    cout << "SOMA DOS IMPARES = " << soma << endl;
    
    return 0;
}