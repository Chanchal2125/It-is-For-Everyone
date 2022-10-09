#Factorial of a Given Number 
#Subhraneel Haldar

subh = int(input("Enter a Number :-  "))    
factorial = 1    
if subh < 0:    
   print(" Factorial does not exist for Negative Numbers")    
elif subh == 0:    
   print("The factorial of 0 is 1")    
else:    
   for i in range(1,subh + 1):    
       factorial = factorial*i    
   print("The Factorial of",subh,"is",factorial)    