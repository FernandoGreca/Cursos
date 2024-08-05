soma = 0

print("Digite dois numeros: ")
n1 = int(input())
n2 = int(input())

if n1 < n2:
    menor = n1
    maior = n2
else:
    menor = n2
    maior = n1

if menor % 2 == 0:
    menor += 1
else:
    menor += 2

if maior % 2 != 0:
    maior -= 1

for i in range(menor, maior, 2):
    soma += i

print(f"Soma dos impares = {soma}")
