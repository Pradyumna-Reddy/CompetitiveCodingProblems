t = int(input())
for _ in range(t):
	n, k = [int(i) for i in input().split(' ')]
	bin_str = input()
	cyclic_shift_array = [None] * len(bin_str)
	for i in range(len(bin_str)):
		cyclic_shift_array[i] = bin_str[i:-1] + bin_str[0:i]
	max(cyclic_shift_array)
	
