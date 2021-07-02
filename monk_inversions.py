# Monk and inversions : CodeMonk
t = int(input())
for i in range(t):
	n = int(input())
	M = []
	for j in range(n):
		R = [int(i) for i in input().split(' ')]
		M.append(R)
	i = 0
	j = 0
	count = 0
	for i in range(n):
		for j in range(n):
			for p in range(i, n):
				for q in range(j, n):
					if(M[i][j] > M[p][q]):
						count = count + 1
	print(count)


# can I do this in lesser time? Like in finding inversions through sorting. I was not good enough on 1 July 21. There must be a way

