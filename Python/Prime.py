def prime(n):
	if n==1:
		return False
	elif n==2:
		return True
	else:
		for i in range(2,n):
			if n%i==0:return False
			else:return True
n=int(input("Enter a number : "))
b=prime(n)
if(b==True):print("{0} is prime".format(n))
else:print("%d is not prime"%n)