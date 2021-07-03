def getOddNumsUpto (val):
	lst = []
	for j in range(0,val+1):
		if j % 2 != 0:
			lst.append(j)
	return lst

while True:
	inp = int(input("enter the maximum limit :"))
	print(getOddNumsUpto (inp))
