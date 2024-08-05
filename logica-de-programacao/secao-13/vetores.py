n = int(input("Quantos valores voce vai digitar: "))

vet = [0 for x in range(n)]

for i in range(0, n):
    vet[i] = float(input("Digite um numero: "))

print("Vetor digitado: ")
for i in range(0, n):
    print(vet[i])
