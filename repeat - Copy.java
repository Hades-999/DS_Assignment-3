import java.util.*;
class repeat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		repeat r=new repeat();
		String str=new String();
		String str2=new String();
		int i=0;
		System.out.println("Enter a String:");
		str=sc.nextLine();
		str2=r.fun(str,i);
		System.out.println("After removing repeating letters:"+str2);
	}
	public String fun(String str,int i)
	{
		String s="";
		char ch;
		if(i==str.length()-1)
		{
			if(str.charAt(i)!=str.charAt(i-1))
			{
				ch=str.charAt(i);
				s=s+ch;
				return s;
			}
			else
				return "";
		}
		else if(i==0||str.charAt(i)!=str.charAt(i-1))
			return str.charAt(i)+fun(str,i+1);
		return fun(str,i+1);
	}
}