t = int(input())
for _ in range(t):
	n, k = [int(i) for i in input().split(' ')]
	bin_str = input()
	min_str = '0'*len(bin_str)
	for i in range(len(bin_str))