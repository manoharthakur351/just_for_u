def make2dList (x,y):
	
	lst2d = []
	
	for a in range(0,y):
		sub_lst = []
		for a in range(0,x):
			inp = input()
			sub_lst.append(inp)
		lst2d.append(sub_lst)
			
	return lst2d

while True:
	val = make2dList(2,3)
	print(val)
