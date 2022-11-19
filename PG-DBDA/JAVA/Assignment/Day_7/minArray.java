/*
Find minimum elements from array
 */
package Array;

import java.util.*;

//passing array as parameter to method
class Testarray2{  
	int min,max;
	int i,j;
	void min(int arr[])
	{
		min=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
				
		
	}	
} 
public class Array_method {

	public static void main(String[] args) {
		int arr[]= {12,34,56,77,1};
		Testarray2 t=new Testarray2();
		t.min(arr);
	}
}
