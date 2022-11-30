'''Q plist=['kohli','rohit','sky']  all list will be user defined
   pruns=[1000,300,700]
   pmatch=[20,15,7]

q1) calculate avg run list =[50 ,20,100]
q2) enter player name and show his stats if player exists in list'''

plist=[]
pruns=[]
pmatch=[]

p=int(input("Enter the player number: "))
for i in range(p):
    str=input("Enter the player name: ")
    plist.append(str)

for i in range(p):
    pr=int(input("Enter the pruns: "))
    pruns.append(pr)

for i in range(p):
    pm=int(input("Enter the pmatch: "))
    pmatch.append(pm)

print(f'player names:{plist}')
print(f'player runs:{pruns}')
print(f'player matches:{pmatch}')
print("-----------------Avg calculate-------------------")

avglist=[]
for i in range(len(pruns)):
    avg=pruns[i]//pmatch[i]
    avglist.append(avg)

print(avglist)

print("-----------------player exist-------------------")
name=input("Enter the player name: ")
for i in range(len(plist)):
    if plist[i]==name:
        print(f'{name} player exist in List!')
