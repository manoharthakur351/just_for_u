def getGrade (marks):
	
	grade = ''
	
	if marks in range(81,101):
		grade = 'A'
	elif marks in range(61,81):
		grade = 'B'
	elif marks in range(41,60):
		grade = 'C'
	elif marks in range(0,41):
		grade = 'D'
	else:
		grade = ''
		print("please give a valid input '0-100'")

	return grade

while True:
	print("",getGrade(int(input())))
