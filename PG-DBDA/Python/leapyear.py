year=int(input('Enter year:'))
if (year%100==0) and (year%400==0) :
  print(f'{year} Is Leap Year')
elif (year%100!=0) and (year%4==0) :
  print(f'{year} Is Leap Year')
else:
  print(f'{year} Is Ordinary Year')
