# Monk and Rotation : Code Monk
t = int(input())
for _ in range(t):
	n, k = [int(i) for i in input().split(' ')]
	R = [int(i) for i in input().split(' ')]
	k = k % n 
	for i in range(k, 0, -1):
		print(R[-i], sep=" ", end=" ")
	for i in range(n-k):
		print(R[i], sep=" ", end=" ")
	print()