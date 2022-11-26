package CoreJAVA_Lab;

public class LeaderInArray
{
	/*Java Function to print leaders in an array */
	void printLeaders(int arr[], int size)
	{
		for (int i = 0; i < size; i++)
		{
			int j;
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == size) // the loop didn't break
				System.out.print(arr[i] + " ");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		LeaderInArray lead = new LeaderInArray();
		int arr[] = new int[] {10, 22, 12, 3, 0, 6};
		int arr2[]=new int[]	{4, 7, 1, 0};
		int n = arr.length;
		int n1 = arr2.length;
		lead.printLeaders(arr, n);
		System.out.println();
		lead.printLeaders(arr2, n1);
		
	}
}
