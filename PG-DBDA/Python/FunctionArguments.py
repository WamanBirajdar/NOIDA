# arbitrary positional arguments
def add(*args):
    sum=0
    for i in args:
        sum+=i
    print(f'summation of numbers is:{sum}')

add(2,3)
add(2,3,4)
add(2,3,4,5)
add(2,3,4,5,6)


#arbitrary keyword arguments

def add(**kwargs):
    print(kwargs,type(kwargs))

add(a=10,b=20,c=30)


def add(**kwargs):
    sum=0
    for number in kwargs.values():
        sum+=number
    print(f'Total summation of nnumber is:{sum}')

add(a=10,b=20)
add(a=10,b=20,c=30)
add(a=10,b=20,c=30,d=40)
