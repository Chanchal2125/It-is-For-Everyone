i=True
while i==True:
    try:
        n=int(input("\nEnter a number : "))#It will not execute if input will other than integer
        if n>=0:
            if n==0:
                print("Entered Number is Zero")
            else:
                print("Entered Number is Positive")
        else:
            print("Entered Number is Negative")
    except:
        print("Enter an integer only")
    finally:
        if(input("\nDo you want to continue(y/n)? -> ")=='y'):
            i=True
        else:
            i=False