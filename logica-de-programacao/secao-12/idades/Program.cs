using System.Globalization;
using System.Net.Http.Headers;

CultureInfo ci = CultureInfo.InvariantCulture;

Console.WriteLine("Dados da primeira pessoa: ");
Console.Write("Nome: ");
string nome1 = Console.ReadLine();
Console.Write("Idade: ");
int idade1 = int.Parse(Console.ReadLine(), ci);

Console.WriteLine("Dados da segunda pessoa: ");
Console.Write("Nome: ");
string nome2 = Console.ReadLine();
Console.Write("Idade: ");
int idade2 = int.Parse(Console.ReadLine(), ci);

double media = (double)(idade1 + idade2) / 2;

Console.WriteLine("A idade media de " + nome1 + " e " + nome2 + " e de " + media.ToString("F1", ci) + " anos");
