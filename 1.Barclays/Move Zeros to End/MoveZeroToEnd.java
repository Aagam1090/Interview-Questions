/*
	1. Move Zero to the End of the Array 
	
	Input:
	4
	2 0 4 3 0 1
	Output:
	2 4 3 1 0 0

	Time Complexity - O(n)
	Space Complexity - O(1)
	
	Link :- https://www.geeksforgeeks.org/move-zeroes-end-array/
			https://leetcode.com/problems/move-zeroes/solution/
			
	Algorithm :- 
		1. Traverse from Left to Right 
		2. If the Element is Zero move the 'i' Pointer keeping Count at the zero 
		3. For all the elements which are non zero keep overwritting at count
		4. For the rest of place put '0' and return the array
		
	Note :- 
		1. Do not use Extra Space 
		2. The Time Complexity should not cross O(n)
	
*/

import java.util.Scanner;

class MoveZeroToEnd
{
	public static int[] solution(int arr[])
	{
		int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length)
        {
            arr[count++] = 0;
        }
        return arr;
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
		arr = solution(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}