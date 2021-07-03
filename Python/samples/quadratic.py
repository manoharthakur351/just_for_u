a = int(input("a = "))
b = int(input("b = "))
c = int(input("c = "))
#ax²+bx+c

#D=b²-4ac
D = (b*b)-(4*a*c)

#x = (-b+-√(d))/2a
R1 = (-b+(D**(1/2)))/(2*a)
R2 = (-b-(D**(1/2)))/(2*a)

print(R1,R2)

