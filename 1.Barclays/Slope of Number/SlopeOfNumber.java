/*
	5. Slope of a Number
		
		Slope of a number is the count of the minima and maxima digits in it.
		A digit is called a minima if the digit is lesser than the digit before 
		and after it. Similarly a digit is called a maxima if the digit is 
		greater than the digit before and after it.
		
		Input :- 
		1213321
		273299302236131
		
		Output :- 
		2
		6
		
		Time Complexity - O(n) // no of char in the String
		Space Compelexity - O(1)
		
		Algorithm :-
			1. Traverse the char of the String from left to right
			2. Loop from 2 to 2nd Last Element
				i. If any element is greater / smaller than its preceding and 
					succeeding element 
					Increment the Count
			3. return the Count
*/
import java.util.*;

class SlopeOfNumber
{
	public static int solution(String str)
	{
		int cnt = 0;
		for(int i=1;i<str.length()-1;i++)
		{
			if( (str.charAt(i) < str.charAt(i-1)) && (str.charAt(i) < str.charAt(i+1)) )
				cnt++;
			if( (str.charAt(i) > str.charAt(i-1)) && (str.charAt(i) > str.charAt(i+1)) )
				cnt++;	
		}
		return cnt;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int res = solution(s);
		System.out.println(res);
	}
}