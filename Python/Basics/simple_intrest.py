# WAP in python to print Simple intrest for a given p, r and t.

p = int( input("Enter principal value: "))
r = int( input("Enter rate of intrest: "))
t = int( input("Enter the time period: "))

si = p*r*t/100
print(f"calculated intrest ={si}.")
