using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int n = 0, negativos = 0, i = 0, j = 0;

Console.Write("Qual a ordem da matriz: ");
n = int.Parse(Console.ReadLine());

int[,] mat = new int[n,n];

for (i = 0; i < n; i++){
    for (j = 0; j < n; j++){
        Console.Write("Elemento [" + i + "," + j + "]: ");
        mat[i,j] = int.Parse(Console.ReadLine());

        if (mat[i,j] < 0){
            negativos = negativos + 1;
        }
    }    
}

System.Console.WriteLine("Diagonal Principal: ");
for (i = 0; i < n; i++){
    for (j = 0; j < n; j++){
        if (i == j){
            Console.Write(mat[i,j] + " ");
        }
    }    
}
System.Console.WriteLine();

System.Console.WriteLine("Quantidade de negativos = " + negativos);


