package Restaurant;

import java.util.*;

class Food
{
	int ch,qty,rate;
	public void getData()
	{
		Scanner s=new Scanner(System.in);
		boolean ch=true;
		while(ch)
		{
			System.out.println("***************************");
			System.out.println("WELCOME TO WAMAN RESTAURANT");
			System.out.println("***************************");
			System.out.println("What do you have to eat!");
			System.out.println("1 Dosa");
			System.out.println("2 Pavbhaji");
			System.out.println("3 Paratha");
			System.out.println("4 Misal");
			System.out.println("0 Exit");
			int choice=s.nextInt();
			switch(choice)
			{
			case 0:
				ch=false;
				System.out.println("Thank you, Visit again!");
				break;
			case 1:
				System.out.println("Enter qty ");
				qty=s.nextInt();
				rate=10*qty;
				System.out.println("Added ot cart: Dosa - Rs"+rate+"/-");
				break;
			case 2:
				System.out.println("Enter qty ");
				qty=s.nextInt();
				rate=10*qty;
				System.out.println("Added ot cart: Pavbhaji - Rs"+rate+"/-");
				break;
			case 3:
				System.out.println("Enter qty ");
				qty=s.nextInt();
				rate=10*qty;
				System.out.println("Added ot cart: Paratha - Rs"+rate+"/-");
				break;
			case 4:
				System.out.println("Enter qty ");
				qty=s.nextInt();
				rate=10*qty;
				System.out.println("Added ot cart: Misal - Rs"+rate+"/-");
				break;
			default:
				System.out.println("you enter invalid choice");
			}
		}
	}
}
public class FoodMenu {

	public static void main(String[] args) {
			Food d=new Food();
			d.getData();
			

	}

}
