/*
	7. Less than Difference
		Find the count of elements in array whose difference 
		from given num is less than or equal to given diff.
		
		Input :- 
		5
		1 2 3 4 5
		3 
		1
		
		Output :- 
		3
		
		Time Complexity  - O(n)
		Space Complexity - O(1)

		Algorithm :-
			1. Subtract and Calculate Difference for all Elements (arr[i] - num)
				i. Increment the cnt if < Diff
			2. return the cnt
*/
import java.util.*;

class LessThanDiff
{
	public static int solution(int arr[] ,int num, int diff)
	{
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] - num < diff )
				cnt++;
		}
		return cnt;
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
		int num = sc.nextInt();
		int d = sc.nextInt();
		int cnt = solution(arr,num,d);
		System.out.println(cnt);

	}
}