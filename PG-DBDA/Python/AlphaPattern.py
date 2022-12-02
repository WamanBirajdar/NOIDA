'''
    s = Delhi
    D
    D e
    D e l
    D e l h
    D e l h i
'''

str="Delhi"
for i,v in enumerate(str):
    for j,v in enumerate(str):
        if i>=j:
            print(v,end=" ")
    print()
