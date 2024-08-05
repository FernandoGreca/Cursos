int n1 = 0, n2 = 0, n3 = 0, menor = 0;

Console.Write("Primeiro valor: "); 
n1 = int.Parse(Console.ReadLine());
Console.Write("Segundo valor: "); 
n2 = int.Parse(Console.ReadLine());
Console.Write("Terceiro valor: "); 
n3 = int.Parse(Console.ReadLine());

if (n1 < n2 && n1 < n3){
    menor = n1;
}else if (n2 < n1 && n2 < n3){
    menor = n2;
} else {
    menor = n3;
}

System.Console.WriteLine("MENOR = " + menor);
