#wap to print al values that devisiable by 3 as well7 by in between 100 to 300

'''for i in range(100,301):
   if i%3==0 and i%7==0:
    print(i)'''

print("--------------------Nesting Loop ----------------------")
#print pattern

r=4
c=4
for i in range(r):
    for j in range(c):
        print(" * ",end="")
    print()
    

print("-------------------------New pattern print---------------")
for i in range(4):
    for j in range(i):
        print(" * ",end="")
    print()


print("--------------------------New patter print----------------------")
for i in range(4):
    for j in range(i):
        print(f' {i}',end="")
    print()

print("--------------------------Revese start patter print----------------------")
for i in range(r):
    for j in range(c):
        if i<=j:
         print(" * ",end="")
    print()


print("--------------------------abc start patter print----------------------")
ch=65
for i in range(r):
    for j in range(c):
        if i<=j:
         print(f' {ch} ',end="")
         ch+=1
    print()
