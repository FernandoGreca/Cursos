using System.Globalization;

CultureInfo ci = CultureInfo.InvariantCulture;

double b, h, area, perimetro, diagonal;

Console.Write("Base do retangulo: ");
b = double.Parse(Console.ReadLine(), ci);

Console.Write("Altura do retangulo: ");
h = double.Parse(Console.ReadLine(), ci);

area = b * h;
perimetro = (2 * h) + (2 * b);
diagonal = Math.Sqrt(Math.Pow(b, 2) + Math.Pow(h, 2));

Console.WriteLine("AREA = " + area.ToString("F4", ci));
Console.WriteLine("PERIMETRO = " + perimetro.ToString("F4", ci));
Console.WriteLine("DIAGONAL = " + diagonal.ToString("F4", ci));