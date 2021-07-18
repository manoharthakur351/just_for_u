
# program to calculate factorial of a number.


'''
5! = 5 * 4 * 3 * 2 * 1
5! = 5 * 4!

'''

def fact_rec(num):
	"""recursive approach"""
	if num == 0 or num == 1:
		return 1
	else:
		return num * fact_rec(num-1)

def fact_itr(num):
	"""iterative approach"""
	fact = 1
	for a in range(1, num+1):
		fact*=num
	return fact

# driver code
number = 0
fact = fact_itr(number)
fact_2 = fact_rec(number)
print(fact, fact_2)
