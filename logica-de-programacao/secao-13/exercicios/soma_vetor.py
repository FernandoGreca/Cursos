soma = 0
cont = 0

n = int(input("Quantos numero voce vai digitar? "))

vet = [0 for x in range(0, n)]

for i in range(0, n):
    vet[i] = float(input("Digite um numero: "))
    soma += vet[i]
    cont += 1

print("Valores = ", end="")
for i in range(0, n):
    print(f"{vet[i]} ", end="")

print()
print(f"Soma = {soma:.2f}")

media = soma / cont

print(f"Media = {media:.2f}")
    
