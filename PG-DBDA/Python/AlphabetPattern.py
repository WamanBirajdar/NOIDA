#print the following pattern
   """
A 
B B 
C C C
D D D D
E E E E E"""
    
    
ch=65
for i in range(5):
    for j in range(5):
        if i>=j:
            print(chr(ch),end=" ")
    ch+=1
    print()
    
'''
1 
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
'''
    
r=5
c=5
for i in range(1,r+1):
    for j in range(1,c+1):
        if i>=j:
            print(i,end=" ")
    print()
    

    

