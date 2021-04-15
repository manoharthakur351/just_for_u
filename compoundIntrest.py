#CompoundIntrest
def compound (p=None,r=None,t=None):
	ci = (p*((1+(r/100))**t))-p
	return ci
pp = int(input())
data=compound(p=5400,r=8,t=3)
amount= 
print('compound interest on Rs.%s is Rs.%s'%(pp,data))
