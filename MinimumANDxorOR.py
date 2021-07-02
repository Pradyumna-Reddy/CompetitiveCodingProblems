# # Minimum and xor or : Code Monk
t = int(input())
for i in range(t):
    n = input()
    a = [int(j) for j in input().split(' ')]
    # a.sort()
    min_xor = 1e9
    for p in range(len(a)-1):
            val = a[p] ^ a[p+1]
            min_xor = min(min_xor, val)
    print(min_xor)