def add():
    a=int(input("Enter afirst numbber:\t"))
    b=int(input("Enter a second number:\t"))
    print(f'addition of two function is: {a} + {b} = {a+b}')

add()


# take input from user and print table of that number

def table():
    n=int(input("Enter a number"))
    for i in range(n,n*11,n):
        print(f'{i}')

table()
