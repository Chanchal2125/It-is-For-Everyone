number = int(input('please enter a Palindrome number\n'))

rem = 0
a = number
if number < 0 : print('this number is not a plindrome!')
while a > 0:
    rem = rem*10 + a % 10
    a = a // 10
print(number)
if rem == number : 
    print(f'This number is palidrome {rem}')
else:
    print(f'this number is not palindrome {rem}')