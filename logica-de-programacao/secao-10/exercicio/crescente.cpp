#include <bits/stdc++.h>

using namespace std;

int main(){

    int n1, n2;

    while (n1 != n2){
        cout << "Digite dois numeros: " << endl;
        
        cin >> n1;
        cin >> n2;

        if (n1 < n2){
            cout << "CRESCENTE!!" << endl; 
        }
        else if (n2 < n1){
            cout << "DECRESCENTE!!" << endl; 
        }
    }
    
    return 0;
}