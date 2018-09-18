import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		fibonacci f=new fibonacci();
		int n,x=0,num;
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		System.out.println("Fibonacci series:");
		for(int i=0;i<n;i++)
			System.out.print(f.series(i)+" ");
	}
	public int series(int n)
	{
		if ( n == 0 )
			return 0;
		else if ( n == 1 )
			return 1;
		else
			return ( series(n-1) + series(n-2) );
	} 
}