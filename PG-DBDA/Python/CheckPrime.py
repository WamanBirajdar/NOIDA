# wap to check number is prime no with  argument and if it is a prime no return true
def checkprime(a):
    k=0
    for i in range(2,a//2+1):
        if(a%i==0):
            k=k+1
    if(k<=0):
        return True
    else:
        return False

a=int(input("Enter number: "))

result=checkprime(a)
print(f'{a} is prime {result}')


def checkprime(n):
    count=0
    for i in range(2,n):
        if n%i==0:
            count=1
            return False
        if count==0:
            return True

n=int(input("Enter a  nubmer"))
result=checkprime(n)
print(f'{n} is prime {result}')
