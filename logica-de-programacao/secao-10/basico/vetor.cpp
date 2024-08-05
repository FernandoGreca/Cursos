#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, m, i, j;

    cout << "Quantas linhas vai ter a matriz? ";
    cin >> n;
    cout << "Quantas colunas vai ter a matriz? ";
    cin >> m;

    double vet[n][m];

    for (i = 0; i < n; i++){
        for (j= 0; j < m; j++){
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> vet[i][j]; 
        } 
    }

    cout << "Matriz gerada: " << endl;
    cout << fixed << setprecision(1);
    for (i = 0; i < n; i++){
        for (j = 0; j < m; j++){
           cout << " " << vet[i][j]; 
        }
        cout << endl;
    }
    
    return 0;
}