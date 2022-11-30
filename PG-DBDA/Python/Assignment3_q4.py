'''
Q l1=[10,20,30,40]
   l2=[1,2,1,3]
output
-----
l3=[10,20,20,30,40] all elements will repeat except the last element
'''
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
l3=[]
for i in range(len(l1)-1):  
    for k in range(l2[i]):
        l3.append(l1[j])
    j+=1

last=len(l1)
last-=1
l3.append(l1[last])   
print(l3)
