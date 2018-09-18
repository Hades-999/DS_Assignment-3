import java.util.*;
class power
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		power pow=new power();
		int n,p,r;
		System.out.print("Enter the base:");
		n=sc.nextInt();
		System.out.print("Enter the power:");
		p=sc.nextInt();
		r=pow.mul(n,p);
		System.out.print(n+" raised to the power "+p+"="+r);
	}
	public int mul(int n,int p)
	{
		if(p==1)
			return n;
		else
			return n*mul(n,p-1);
	}
}