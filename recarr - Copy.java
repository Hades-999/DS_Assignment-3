import java.util.*;
class recarr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		recarr r=new recarr();
		int n,x=0,num,i;
		System.out.print("Enter the size of array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter any "+n+" values:");
		r.input(x,a);
		System.out.print("Enter the number you want to search:");
		num=sc.nextInt();
		i=r.numsearch(a,num,x);
		if(i==-1)
			System.out.println("The number does not exist in the array");
		else
			System.out.println("The Index of "+num+" is:"+i);
	}
	public void input(int x,int a[])
	{
		Scanner sc=new Scanner(System.in);
		if(x==a.length-1)
			a[x]=sc.nextInt();
		else
		{
			a[x]=sc.nextInt();
			input(x+1,a);
		}
	}
	public int numsearch(int a[],int num,int x)
	{
		if(a[x]==num)
			return x;
		else if(x==a.length-1)
			return -1;
		else
			return numsearch(a,num,x+1);
	}
}