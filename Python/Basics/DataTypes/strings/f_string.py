# make a simple message using your name and age

# f Strings
name = input("name : ")
age = int(input("age : "))
msg = "my name is %s, I am %s years old."%(name,age)
print(msg)

"""
NOTES
* use "*s" in place where u wanna put a different data
* to add different data you have to use following syntax:
	%(var1,var1,var3)
* do not use Comma in between string and %(v,v,v).
"""
