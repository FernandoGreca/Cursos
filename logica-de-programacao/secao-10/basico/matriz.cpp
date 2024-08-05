#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, i;

    cout << "Quantos numeros voce vai digitar? ";
    cin >> n;

    double vet[n];

    for (i = 0; i < n; i++){
        cout << "Elemento [" << i << "]: ";
        cin >> vet[i]; 
    }

    cout << "Vetor gerado: " << endl;

    for (i = 0; i < n; i++){
        cout << vet[i] << endl;
    }
    
    return 0;
}