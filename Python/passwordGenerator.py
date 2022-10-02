import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
characters = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the PyPassword Generator!")
number_letters= int(input("How many letters would you like in your password?\n")) 
number_characters = int(input(f"How many symbols would you like?\n"))
number_numbers = int(input(f"How many numbers would you like?\n"))


#Eazy Level - Order not randomised:
#e.g. 4 letter, 2 symbol, 2 number = JduE&!91

password= ""

for i in range(0,number_letters):
  password += random.choice(letters)

for i in range(0,number_characters):
  password += random.choice(characters)

for i in range(0,number_numbers):
  password += random.choice(numbers)

print(password)


#Hard Level - Order of characters randomised:
#e.g. 4 letter, 2 symbol, 2 number = g^2jk8&P

password_list = []
password = ""

for i in range(0,number_letters):
  password_list.append(random.choice(letters))

for i in range(0,number_characters):
  password_list.append(random.choice(characters))

for i in range(0,number_numbers):
  password_list.append(random.choice(numbers))

random.shuffle(password_list)

for p in password_list:
  password += p

print(password)