package Array;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]=new int[10];
		
		for(int i=0;i<a.length;++i)
		{
			a[i]=i;
			System.out.println(a[i]);
			i++;
		}
	}

}

/*
ouput-->
0
2
4
6
8

*/
