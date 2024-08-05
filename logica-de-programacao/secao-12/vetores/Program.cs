using System;
using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int n, i;

System.Console.Write("Quantos numeros voce vai digitar? ");
n = int.Parse(Console.ReadLine());

double[] vet = new double[n]; 

for (i = 0; i < n; i++){
    System.Console.Write("Digite um numero: ");
    vet[i] = double.Parse(Console.ReadLine(), ci);
}

System.Console.WriteLine();
System.Console.WriteLine("NUMEROS DIGITADOS: ");
for (i = 0; i < n; i++){
    System.Console.WriteLine(vet[i].ToString("F1", ci));
}


