/*
	9. 2D Matrix Sorting
	
		Sort the given 2D Matrix with size n*n
	
		Input :- 
		3 
		9 7 1
		3 2 4 
		6 8 5
		
		Output :- 
		1 2 3
		4 5 6
		7 8 9
		
		Time Complexity  - O(nLogn)
		Space Complexity - O(n*n)
		
		Algorithm :- 
			1. Take the Input in 2D Matrix
			2. Convert it into a 1-D Array and Sort it
			3. Overwrite the 2D Matrix and return it.
			
		// Other Approach uses Time -  O(n^2 log n) Space - O(n*n)
			Link :- https://www.geeksforgeeks.org/sort-given-matrix/
			
*/
import java.util.*;

class TwoDMatSort
{
	public static int[][] solution(int arr[][] ,int n)
	{
		int tarr[] = new int[n*n];
		int k = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				tarr[k] = arr[i][j];
				k++;
			}
		}
		Arrays.sort(tarr);
		k = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = tarr[k];
				k++;
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		arr = solution(arr,n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}