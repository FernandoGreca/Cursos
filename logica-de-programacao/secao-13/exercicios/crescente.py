n1 = 0
n2 = 1

while n1 != n2:
    print("Digite dois numeros: ")
    n1 = int(input())
    n2 = int(input())

    if n1 < n2:
        print("CRESCENTE!!")
    elif n2 < n1:
        print("DECRESCENTE!!")
