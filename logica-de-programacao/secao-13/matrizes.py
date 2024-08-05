n = int(input("Quantas linhas vai ter a matriz? "))
m = int(input("Quantas colunas vai ter a matriz? "))

mat = [[0 for x in range(m)] for x in range(n)]

for i in range(0, n):
    for j in range(0, m):
        mat[i][j] = int(input(f"Elemento [{i},{j}]: "))

print()
print("Matriz Gerada: ")
for i in range(0, n):
    for j in range(0, m):
        print(f"{mat[i][j]} ", end="")
    print()