/*
one dimensional array
 */

package Array;

import java.util.*;

public class Array_2D {

	public static void main(String[] args) {
		
		int i,j;
		//various declaration of arrays
		int arr[]=new int[3];		//first form 
		
		int [] arr1=new int[4];		//second form
		
		int []arr2=new int[2];		//third form
		
		int a[]=new int[5];
		//initialization of array
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//displaying array elements on console
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}		
	}

}
