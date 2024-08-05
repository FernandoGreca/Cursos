using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

int m, n, i, j;

m = 0;
n = 0;

Console.Write("Quantas linhas vai ter a matriz? ");
n = int.Parse(Console.ReadLine());

Console.Write("Quantas colunas vai ter a matriz? ");
m = int.Parse(Console.ReadLine());

int[,] mat = new int[n, m]; 

for (i = 0; i < n; i++){
    for (j = 0; j < m; j++){
        Console.Write("Elemento [" + i + "," + j + "]: ");
        mat[i, j] = int.Parse(Console.ReadLine());
    }
}

System.Console.WriteLine();
Console.WriteLine("MATRIZ DIGITADA: ");
for (i = 0; i < n; i++){
    for (j = 0; j < m; j++){
        Console.Write(mat[i, j] + " ");
    }
    System.Console.WriteLine();
}