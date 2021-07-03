def getSeries (max):
	result = 0
	counter = 0
	while counter <= max:
		result += counter
		counter+=1
	return result

while True:
	inp = int(input("enter the maximum number of the series : "))
	print("sum of series 1+2..."+str(inp),"is",getSeries(inp))

