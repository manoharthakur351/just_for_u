def isVovel (char):
	
	result = None
	if char in "aeiou":
		result = True
	else:
		result = False
	return result
	
while True:
	print(isVovel(input("enter a character : ")),"\n")
