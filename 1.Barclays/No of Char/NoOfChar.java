/*
	3. No of Character
		Count the no of Characters present in the String
		
		Input :- 
			Hello My Number is 1234
			
		Output :-
			The No of Char are 15
		
		Time Complexity  - O(n) // n is the input String Size
		Space Complexity - O(1)
		
		Algorithm 
			1. Traverse through each character of the String
			2. Use method 'Character.isLetter' to check if its Letter or not
				and increment count if its a letter 
			3. Return the count
*/
import java.util.*;

class NoOfChar
{
	public static int solution(String str)
	{
		int cnt = 0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int no_of_char = solution(s);
		System.out.println("No of Char are  " + no_of_char );
	}
}