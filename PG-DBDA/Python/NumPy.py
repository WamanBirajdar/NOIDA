import numpy as np
#used to create n dimentional arrays
#perform mathematical operation on these arrays directly
#we can not create mathermatical operation on list directly we need to access them by eunning loop


#Q cal culate square number of elements in a list
l=[10,20,30,40]
ls=[]
for i in l:
    ls.append(i**2)
print("square list is:{}".format(ls))

#numpy is indexed,ordered,unsorted,duplicate allowed
#create array with name arr and pass object of list 
arr=np.array([10,20,30,40])
print("type of array is{} and array is{}".format(type(arr),arr))

#square of all ements of array
print("square of all element is{}".format(arr**2))

#print dimentional of array

print("dimentional of array: {}".format(arr.ndim))
print("size of array element is {}".format(arr.size))
print("size of individual element is:{} in bytes".format(arr.itemsize))

#change datatype of array use in float32 ot in int

#shape of array
print("shape of array is {}".format(arr.shape))

#asarray() convert input to an array only we get two arguments
#arr2=np.asarray()


#when you want to create multidimentional array
m1=np.array([[1,2,3],[4,5,6],[7,8,9]],dtype=np.int32)
print("3*3 create dimentional array\n{}".format(m1))
print("shape of array is{}".format(m1.shape))

#zeros(shape,dtype) return a new array of given shape and type filled withi zeros

mz=np.zeros((2,3),dtype=np.int32)
print("zero array matrix\n{}".format(mz))

#ones(shape,dtpe) print matix of ones return a new array of given shape and type filled woth ones

#full(shape,filled_vlaue) return a new array of given shape and type filled with 
#n=int(input("ENter number to fill array"))


#np.rnadom.rand(shape) it will generate random array having value 0 to 1
#create random array
rearray=np.random.rand(3,3)
print("radom array\n{}".format(rearray))

#geberate array using random values having low,high,size parameter
rintarray=np.random.randint(low=5,high=10,size=(3,3))
print("print randiom integer array\n{}".format(rintarray))
print("shape of array is {}".format(rintarray.shape))

#arange(start,end,step) it will generate 1dim array of given range
arr3=np.arange(10,20,2)
print("array using given range{}".format(arr3))
print("shape of arange array is one dimentional {}".format(arr3.shape))
