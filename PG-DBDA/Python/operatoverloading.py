#operator overloading
class Area:
    height=0
    width=0

    def __init__(self,height,width):
        self.height=height
        self.width=width

    def __add__(self,other):
        print("hello operator overloading")
        print(f'value of a1:{self.height},{self.width}')
        print(f'value of a2:{other.height},{other.width}')
        self.height=self.height+other.height    #a1.height=15
        self.width=self.width+other.width       #a1.width=30
        return (self.height,self.width)

    def getArea(self):
        area=self.height+self.width
        return area

    def getDetails(self):
        print(f'height:{self.height} width:{self.width}')

a1=Area(10,20)
a2=Area(5,10)
print(a1+a2)
print(a2.getDetails())
print(a1.getDetails())
