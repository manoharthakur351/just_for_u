def isVovel (char):
	C1 = char == "a"
	C2 = char == "e"
	C3 = char == "i"
	C4 = char == "o"
	C5 = char == "u"
	
	if C1 or C2 or C2 or C4 or C5:
		return True
	else :
		return False

while True:
	print(isVovel(input("enter a character : ")),"\n")
