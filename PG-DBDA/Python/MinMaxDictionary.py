#Write a Python program to get the maximum and minimum value in a dictionary.
laptops={
    'hp':4,
    'asus':3,
    'samsung':1,
    'mac':8
    }

min_value=min(laptops.values())
max_value=max(laptops.values())
print(f'minimum value in given dictionary is: {min_value}')
print(f'maximum vlaue in givne dictionary is: {max_value}')

'''
minimum value in given dictionary is: 1
maximum vlaue in givne dictionary is:8'''
