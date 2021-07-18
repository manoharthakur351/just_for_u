# BUBBLE SORT

def bubble_sort (lst):
	l = len(lst)
	for a in range(l-1,0,-1):
		for b in range(0,a):
			C1 = lst[b]
			C2 = lst[b+1]
			if C1 > C2 :
				lst[b],lst[b+1] = lst[b+1],lst[b]
	return lst


# DRIVER LIST
l = [3,22,4,1,0.50]
print("list earlier : ",l)

output = bubble_sort(l)
print("list now     : ",output)
