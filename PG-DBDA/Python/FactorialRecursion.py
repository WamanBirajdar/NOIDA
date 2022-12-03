#wap to print factorial of given 

def fact(num):
    if num==0:
        return 1
    if num>0:
        return num * fact(num -1)

result=fact(5)
print(f'factorial of given number is:{result}')
