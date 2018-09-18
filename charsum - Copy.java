import java.util.*;
class charsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		charsum ch=new charsum();
		String s=new String();
		System.out.println("Enter an alphanumeric string:");
		s=sc.nextLine();
		char c[]=s.toCharArray();
		int x=0;
		int n=ch.sum(c,x);
		System.out.println("Sum of digits in the string="+n);
	}
	public int sum(char c[],int x)
	{
		if(x==c.length-1)
		{
			if(c[x]>=48&&c[x]<=57)
				return ((int)c[x]-48);
			else
				return 0;
		}
		else if(c[x]>=48&&c[x]<=57)
			return ((int)c[x]-48)+sum(c,x+1);
		else
			return sum(c,x+1);
	}
}