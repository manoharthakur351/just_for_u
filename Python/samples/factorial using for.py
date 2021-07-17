
def fact (num):
	rslt = 1
	for a in range(2,num+1):
		rslt *= a
	return rslt

while True:
	inp = int(input("Enter a number : "))
	print("factorial of",inp,"is",fact(inp))
