/*
	8. Sum of K Smallest & K Largest Element
		
		Find the Sum of K smallest and K Largest Element of Array
		
		Input :- 
		5 
		1 4 2 3 5
		2
		
		Ouput:-
		6
		
		Time Complexity  - O(nLogn)
		Space Complexity - O(1)
	
		Algorithm :-
			1. Sort the Input Array
			2. Find the K Smallest and K Largest
			3. Return the Sum 
*/

import java.util.*;

class KsmallKLarge
{
	public static int solution(int arr[] ,int n, int k)
	{
		Arrays.sort(arr); // Merge Sort in Java 
		return arr[k-1] + arr[n-k];
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int res = solution(arr,n,k);
		System.out.println(res);
	}
}