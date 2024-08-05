int n1, n2, menor, maior, soma = 0;

System.Console.WriteLine("Digite dois numeros: ");
n1 = int.Parse(Console.ReadLine());
n2 = int.Parse(Console.ReadLine());

if (n1 < n2){
    menor = n1;
    maior = n2;
} else {
    menor = n2;
    maior = n1;
}

if (menor % 2 == 0){
    menor += 1;
}else {
    menor += 2;
}

if (maior % 2 != 0){
    maior -= 1;
}

for (int i = menor; i < maior; i += 2){
    soma += i;
}

Console.WriteLine("SOMA DOS IMPARES = " + soma);
