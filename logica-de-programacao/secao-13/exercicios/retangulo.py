import math

base = float(input("Digite a largura do terreno: "))
altura = float(input("Digite o comprimeito do terrno: "))

area = base * altura
perimetro = (base * 2) + (altura * 2)
diagonal = math.sqrt((base ** 2) + (altura ** 2))

print(f"Area = {area:.4f}")
print(f"Perimetro = {perimetro:.4f}")
print(f"Diagonal = {diagonal:.4f}")
