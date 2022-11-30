'''1)take 2 user defined list of same length
l1=[10,20,30,40]
l2=[1,2,1,3]
output
-----
l3=[10,20,20,30,40,40,40]'''

l1=[]
l2=[]

num=int(input("Enter the number: "))


for i in range(num):
    n=int(input("Enter value to add in list1: "))
    l1.append(n)
for i in range(num):
    m=int(input("Enter value to add in list2:  "))
    l2.append(m)

j=0
t=0
l3=[]
for i in range(len(l1)):  
    for k in range(l2[j]):
        l3.append(l1[t])
    j+=1
    t+=1
    

print(l3)
