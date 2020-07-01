/*
	2. Name Exists
	
	If the Name is Seen before the output should be Yes or else the 
	output should be NoClassDefFoundError
	
	Input :-
	5
	Ross Monica Ross Chandler Monica
	
	Output :-
	NO NO YES No YES
	
	Time Complexity  - O(n)
	Space Complexity - O(n) // Could be optimized to be done in O(1)
	
	Algorithm :-
		1. Make a HashMap and keep adding elements in the map
		2. If the HashMap containsKey as arr[i] then print Yes
			Or Add the element of HashMap 
	
	// Other Approach - Sort the Array and if neighboring element is same as previous 
						one print 'YES' or print 'NO' 
						Time Complexity  - O(nlogn)
						Space Complexity - O(1)

*/
import java.util.*;

class NameExists
{
	public static void solution(String arr[],int n)
	{
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
				hmap.put(arr[i],1);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		solution(arr,arr.length);
	}
}