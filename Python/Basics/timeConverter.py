'''
program to convert Seconds in to 
hours, minutes and seconds.
'''
def secToTime (sec):
	seconds = sec % 60
	pre_minutes = (sec-seconds)/60
	minutes = pre_minutes % 60
	pre_hours = (pre_minutes-minutes)/60
	hours = pre_hours /60
	print("\n",int(hours),"hours\n",int(minutes),"minutes\n",int(seconds),"seconds\n")

while True:
	secToTime(int(input("enter no of seconds : ")))
