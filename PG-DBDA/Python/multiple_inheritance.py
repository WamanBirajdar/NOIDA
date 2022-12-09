#multiple inheritance


#parent class 1
class Person:
    def person_info(self,name,age):
        print("inside person class")
        print(f'name:{name} and {age}')

#parent class 2
class Company:
    def company_info(self,company_name,location):
        print("inside company class")
        print(f'company name:{company_name} and location:{location}')

#child class
class Employee(Person,Company):
    def employee_info(self,salary,skill):
        print("inside employee class")
        print(f'salary:{salary} and skill:{skill}')

#create object of employee

emp=Employee()


#access data
emp.person_info('waman',23)
emp.company_info('google','usa')
emp.employee_info(120000,'ml')
