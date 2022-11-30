#sort the elements without using predefined methods

l1=[60,70,40,10]
l=len(l1)

for i in range(l):
    for j in range(i+1,l):
        if l1[i]>l1[j]:
            temp=l1[i]
            l1[i]=l1[j]
            l1[j]=temp

print(l1)
