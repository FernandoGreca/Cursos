#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, m, i, j;

    cout << "Qual a quantidade de linhas da matriz? ";
    cin >> n;
    cout << "Qual a quantidade de colunas da matriz? ";
    cin >> m;

    int matriz[n][m];

    for (i = 0; i < n; i++){
        for (j = 0; j < m; j++){
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> matriz[i][j];
        }
    }

    cout << "VALORES NEGATIVOS: " << endl;

    for (i = 0; i < n; i++){
        for (j = 0; j < m; j++){
            if (matriz[i][j] < 0){
                cout << matriz[i][j] << endl;
            }
        }
    }
    
    return 0;
}