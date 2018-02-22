
import java.util.*;
class StringAddition
{
	public static void main(String[] arg)
	{
		String str[]={"12","13","asd"};
		stringSum(str);
	}
	public static void stringSum(String[] str)
	{
	int sum=0;
		for(int i=0;i<str.length;i++)
		{
		int s=0;
		
			for(int j=0;j<str[i].length();j++)
			{
				char c=str[i].charAt(j);
				
				if(Character.isDigit(c))
				{
					s++;
					
				}
			}
			if(s==str[i].length())
				{	System.out.println(str[i]);
					int n=Integer.parseInt(str[i]);
					sum=sum+n;
				}
		}
		System.out.println("Sum :"+sum);
	}
}
  
