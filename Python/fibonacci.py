n = int(input("How many terms?: "))

n1, n2, count = 0, 1, 0

if n <= 0:
   print("Please enter a positive integer")
elif n == 1:
   print("Fibonacci sequence upto",n,":")
   print(n1)
else:
   print("Fibonacci sequence:")
   print(n1)
   print(n2)
   for i in range(2, n):
      count = n1 + n2
      n1 = n2
      n2 = count
      print(count)