import java.util.*;
class revarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		revarray r=new revarray();
		int i=0,j,n,x=0;
		System.out.print("Enter the size of array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter any "+n+" values:");
		r.input(x,a);
		j=a.length-1;
		r.revorder(a,i,j);
		System.out.println("Reverse order:");
		r.output(x,a);
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
	public void revorder(int a[],int i,int j)
	{
		int x;
		if(i==a.length/2)
		{
			x=a[i];
			a[i]=a[j];
			a[j]=x;
		}
		else
		{
			x=a[i];
			a[i]=a[j];
			a[j]=x;
			revorder(a,i+1,j-1);
		}
	}
	public void output(int x,int a[])
	{
		if(x==a.length-1)
			System.out.println(a[x]);
		else
		{
			System.out.println(a[x]);
			output(x+1,a);
		}
	}
}