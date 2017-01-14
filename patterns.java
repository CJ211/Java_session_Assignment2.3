import java.util.*;

class patterns
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			
		int i,s,j,k;
	
		System.out.println("Enter the no of alphabets wanted");
		int n=sc.nextInt();
	
		for (i=1;i<=n;i++)
		{
			for (s=1;s<=n-i;s++)
			{
				System.out.print(" "); //double spaces
			}
		
			for (j=1;j<=i;j++)
			{
				System.out.print((char)(j+96)); //printing front values
			}
			
			for (k=i-1;k>=1;k--)
			{
				System.out.print((char)(k+96)); //printing back values
			}
	
			System.out.println();
		}

		for (i=n-1;i>=1;i--)
		{
			for (s=1;s<=n-i;s++)
			{
				System.out.print(" "); //double spaces
			}
		
			for (j=1;j<=i;j++)
			{
				System.out.print((char)(j+96));
			}
		
			for (k=i-1;k>=1;k--)
			{
				System.out.print((char)(k+96));
			}
			
			System.out.println();
		}
	}
}
