# Exercise 1: Create a function in Python
def person(name,age):
    print(f'name of person is:{name} and age:{age}')

person('waman',22)


#create function variable length of argument

def fun(*args):
    for i in args:
        print(i)

fun(10,20)

fun(20,40,60)

print(f'return multiple valur from function')

#Exercise 3: Return multiple values from a function
def calculation(num1,num2):
    sum=num1+num2
    sub=num1-num2
    return sum,sub

res=calculation(40,10)
print(res)

print("------------------------------")
print("create a function with default argument")

def show_employee(name,salary=9000):
    print(f'name:{name} and salary:{salary}')


show_employee("waman",40000)
show_employee("kalpesh")

print("--------------nested function-------------")
#Exercise 5: Create an inner function to calculate the addition in the following way
def outer_fun(a,b):
    def inner_fun(a,b):
        return a+b
    
    add=inner_fun(a,b)
    return add+5

res=outer_fun(5,10)
print(res)


print("--------create recursive function--------------")
#calculate sum of numbers from 0 to 10

def calculation(num):
    if num:
        return num + calculation(num -1)

    else:
        return 0

res=calculation(10)
print(res)

#Exercise 7: Assign a different name to function and call it through
print("---------assign different name to function during calling time----------")
def display_student(name, age):
    print(name, age)

display_student("Emma", 26)

show_student=display_student
show_student("waman",25)

print("-----------------generate python list of even numbers-----------------")

print(list(range(4,30,2)))


print("-----------------find the largest item from given list-----------------")

x = [4, 6, 8, 24, 12, 2]
print(max(x))

print("------------------arbitrary keyword argument---------")
#arbitrary keyword arguemnet allow to pass many many keyword vlaues
# **kwargs that will stored  dictionary
#arbitrary positional arguments it will allow to pass any positoinal arguments
# *args that will stored tuple
# *vargs also called variable length arguments


def fun(**args):
    for i,j in args.items():
        print(i,j)

fun(name='waman', age=22, salary=30000)

def fun(*args):
    for i in args:
        print(i)

fun('waman',22)


