/* create class date and with different methods like showdate,setdate,setmonth,setyear and different instance variables dd,mm,yy
   create another main class and call them 
*/

package Day_1;


//this is a date class

class Date{
	int dd,mm,yy;
	void showDate()
	{
		System.out.println("Date is: "+dd+"-"+mm+"-"+yy);
	}
	void setDate(int d)
	{
		dd=d;
	}
	
	void setMonth(int m)
	{
		mm=m;
	}
	void setYear(int y)
	{
		yy=y;
	}
	
}
public class Date_Example {

	public static void main(String[] args) {
		
		Date d1=new Date();
		
		d1.showDate();
		d1.setDate(17);
		d1.setMonth(11);
		d1.setYear(2022);
		d1.showDate();
	}

}
