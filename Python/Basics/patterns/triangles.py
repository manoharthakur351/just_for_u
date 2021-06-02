"""
program to print

*

* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
"""
for a in range(0,10):
	for b in range (0,a):		print('*',end=' ')
	print()
"""
program to print
* * * * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
"""
for a in range(10,0,-1):
	for b in range (0,a):
		print('*',end=' ')
	print()
"""
program to print
* * * * * * * * * *
  * * * * * * * * *
    * * * * * * * *
      * * * * * * *
        * * * * * *
          * * * * *
            * * * *
              * * *
                * *
                  *
"""
for a in range(0,10):
	for b in range (0,a):
		print(' ',end=' ')
	for b in range(0,10-a):
		print('*',end = ' ' )
	print()
"""
prgram to print
                  *
                * *
              * * *
            * * * *
          * * * * *
        * * * * * *
      * * * * * * *
    * * * * * * * *
  * * * * * * * * *
"""
for a in range(0,10):
	for b in range (0,10-a):
		print(' ',end=' ')
	for b in range(0,a):
		print('*',end = ' ' )
	print()
