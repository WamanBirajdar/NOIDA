#enumatre function is count the iterator and return in offset
list1=[10,20,30,40,50]
for i in enumerate(list1):
    print(i)
    
#enumerate function
list1=[1,2,3,4,5,6,7,8]
for i in enumerate(list1):
    print(i)

#ennumerate function

for index , item in enumerate(list1):
    if item %2==0:
        list1[index]='even'
print(list1)
