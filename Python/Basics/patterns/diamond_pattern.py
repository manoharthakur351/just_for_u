# write a program to print diamomd pattern
n = int( input ( "Ente4r no of rows :"))

for i in range(n):
    for j in range(n-i):
        print(" ", end =" ")
    for j in range(i):
        print("*", end =" ")
    for j in range(i-1):
        print("*", end =" ")
    
    print("")
    
for i in range(n):
    for j in range(i):
        print(" ", end =" ")
    for j in range(n-i):
        print("*", end =" ")
    for j in range(n-i-1):
        print("*", end =" ")
    
    print("")
