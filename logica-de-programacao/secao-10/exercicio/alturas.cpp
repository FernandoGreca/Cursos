#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, i, cont = 0;
    double taltura = 0, mediaaltura, menor16 = 0, mediamenor;

    cout << "Quantas pessoas serao digitas? ";
    cin >> n;

    string nome[n];
    int idade[n];
    double altura[n];

    for (i = 0; i < n; i++){
        cout << "Dados da " << i+1 << "a pessoa:" << endl;
        cout << "Nome: ";
        cin >> nome[i];

        cout << "Idade: ";
        cin >> idade[i];

        cout << "Altura: ";
        cin >> altura[i];

        taltura = taltura + altura[i];
        cont = cont + 1;
    }

    cout << fixed << setprecision(2);
    mediaaltura = (double)taltura / cont;
    cout << "Altura media: " << mediaaltura << endl;

    for (i = 0; i < n; i++){
        if (idade[i] < 16){
            menor16 = menor16 + 1;
        }
    }

    cout << fixed << setprecision(1);
    mediamenor = (double)(menor16 / cont) * 100;
    cout << "Pessoas com menos de 16 anos: " << mediamenor << "%" << endl;

    for (i = 0; i < n; i++){
        if (idade[i] < 16){
            cout << nome[i] << endl;
        }
    }
    
    return 0;
}