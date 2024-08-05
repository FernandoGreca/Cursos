using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int idade;
double salario;
string nome;
char sexo;

idade = 32;
salario = 4560.9;
nome = "Maria Silva";
sexo = 'F';

System.Console.WriteLine("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + salario.ToString("F2", ci) + " e tem " + idade + " anos de idade." );
