rev=0
rem=0
num=int(input('Enter Number'))
num1=num
while num>0 :
  rem=num%10
  rev=rev*10+rem
  num//=10
  
if num1==rev :
  print(f'{num1} Is Palindrome')
else:
  print(f'{num1} Is Not Palindrome')
