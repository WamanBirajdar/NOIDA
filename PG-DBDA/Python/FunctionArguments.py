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
