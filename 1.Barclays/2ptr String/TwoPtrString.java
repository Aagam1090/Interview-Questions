/*
	4. 2 Pointer String 
	
		Output should be a sequence of characters where first character would be 
		coming from left side of the input string and next character would be from 
		right side of the string.
	
		Input :-
			130 
			1234
		Output :- 
			103 
			1423
			
		Time Complexity - O(n/2) // n is the input String Size
		Space Compelxity - O(1)
		
		Algorithm :-
			1. Use 2 Pointer and point to the ends of the String
			2. while both ptr dont cross each other
				i. Take the Left Character and Right Character and append 
					to new String
			3. If the Size is Odd then middle element wont be added by the loop
				hence add that manually and return the String
			4. For Even Elements return the String 
*/
import java.util.*;

class TwoPtrString
{
	public static String solution(String str)
	{
		int i = 0;
		int j = str.length()-1;
		String res = "";
		while(i < j)
		{
			res += str.charAt(i);
			res += str.charAt(j);
			i++;
			j--;
		}
		if(str.length() % 2 == 0)
			return res;
		else
			return res + str.charAt(str.length()/2);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = solution(s);
		System.out.println(res);
	}
}