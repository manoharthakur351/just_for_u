import turtle as t
import math as m
import random as r
import time as tt
an = 1
while True:
	an += 1
	
	lst = list(range(0,361))
	t.speed(1000)
	a = r.choice(lst)
	a = an
	b = 180+(90-a)
	Sinn = m.sin(m.radians(a))
	coss = m.cos(m.radians(a))
	print()
	t.lt(a)
	h=500
	t.fd(h)
	t.lt(b)
	tt.sleep(0)
	t.fd(Sinn*500)
	t.rt(90)
	t.fd(coss*500)
