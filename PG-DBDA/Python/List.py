print("----------------Append method-----------------------")
l1=[10,20,30,40]
print(f'print before appending{l1}')
l1.append(50)
print(f'print after appending {l1}')
print()
print("----------------occurence Method-----------------------")
v=int(input("ENTER THE OCCURENCE OF NUMBER"))
occ=l1.count(v)
print(f'{v} found {occ} times in list')
print()
print("----------------insert Method-----------------------")
index=int(input("Enter the index to add element"))
v1=int(input("Enter the value add to given index"))
l1.insert(index,v)
print(f'list after insertion{l1}')
print()
print("----------------pop Method-----------------------")
print(f'list before pop{l1}')
l1.pop()
print(f'list after pop{l1}')
print("----------------pop Method-----------------------")
print(f'list before remove{l1}')
ele=int(input("Enter the element to remove from list"))
l1.remove(ele)
print(f'list after remove{l1}')