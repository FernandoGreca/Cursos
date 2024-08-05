negativos = 0

n = int(input("Qual a ordem da matriz? "))

mat = [[0 for x in range(n)] for x in range(n)]

for i in range(0, n):
    for j in range(0,n):
        mat[i][j] = int(input(f"Elemento [{i},{j}]: "))
        if mat[i][j] < 0:
            negativos += 1

print("Diagonal principal:")

for i in range(0, n):
    for j in range(0,n):
        if i == j:
            print(f"{mat[i][j]} ", end="")

print()
print(f"Quantidade de negativos = {negativos}")


