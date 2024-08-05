using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int n;
double soma = 0, media = 0, cont = 0;

System.Console.Write("Quantos numeros voce vai digitar? ");
n = int.Parse(Console.ReadLine());

double[] vet = new double[n];

for (int i = 0; i < n; i++){
    System.Console.Write("Digite um numero: ");
    vet[i] = double.Parse(Console.ReadLine(), ci);

    soma += vet[i];
    cont += 1;
}

System.Console.Write("Valores = ");
for (int i = 0; i < n; i++){
    System.Console.Write(vet[i].ToString("F1", ci) + " ");
}
System.Console.WriteLine();

System.Console.WriteLine("Soma = " + soma.ToString("F2", ci));

media = soma / cont;
System.Console.WriteLine("Media = " + media.ToString("F2", ci));

