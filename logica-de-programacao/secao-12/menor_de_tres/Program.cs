using System;
using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int n1 = 1, n2 = 0;

while (n1 != n2){
    Console.WriteLine("Digite dois numeros: ");
    n1 = int.Parse(Console.ReadLine());
    n2 = int.Parse(Console.ReadLine());

    if (n1 < n2){
        System.Console.WriteLine("CRESCENTE!!");
        
    }
    else if (n2 < n1){
        System.Console.WriteLine("DECRESCENTE!!");
    } 
    else{
        n1 = 1;
        n2 = 1;
    }
}