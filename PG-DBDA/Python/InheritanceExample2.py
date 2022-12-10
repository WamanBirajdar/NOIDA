#a quadrilateral class is first defined, and it is used as a base class for the rectangle class.
#A quadrilateral class having four sides as instance variables and a perimeter() method

class quadrilateral:
    def __init__(self,a,b,c,d):
        self.side1=a
        self.side2=b
        self.side3=c
        self.side4=d

    def perimeter(self):
        p=self.side1+self.side2+self.side3+self.side4

        print(f'perimeter of quadrilateral:{p}')


q=quadrilateral(7,6,5,4)
q.perimeter()

#output: 22
  
