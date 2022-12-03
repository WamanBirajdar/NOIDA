# wap program to do sum of natural numbers
n = 0
for i in range (1, 4):
 n += i
print(f' sum of given natural nubers is:{n}')


#sum of natural numbers using recursion

def sum(n):
    if n == 1:
        return 1
    return n + sum(n - 1)

Natural_Sum=sum(4)
print(f'sumation of natural number is :{Natural_Sum}')


#tail recursion in very bad practice

def countdown(n):
    if n==0:
        print("blast off")
    else:
        print(n)
        countdown(n-1)
'''
 sum of given natural nubers is:6
sumation of natural number is :10
5
4
3
2
1
blast off'''
