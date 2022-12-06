#lambda function with filter function

l1=[2,4,6,8,10]
s=[i for i in filter(lambda x:x>5,l1)]
print(s)
