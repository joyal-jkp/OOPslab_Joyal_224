
import java.util.*;
public class Matrix {

public static void main(String args[])
{ 
	int m,n,i,j;
	int a[][] = new int[10][10];
	int b[][] = new int[10][10];
	int c[][] = new int[10][10];
	Scanner in =new Scanner(System.in);
	System.out.println("Enter row value of matrix ");
	m= in.nextInt();
	System.out.println("Enter column value of matrix ");
	n=in.nextInt();
	System.out.println("Enter matrix one elements");
	for( i=0;i<m;i++)
	{
		for( j=0;j<n;j++)
		{
		 a[i][j]=in.nextInt();
		}
	}
	System.out.println("Enter matrix two elements");
	for( i=0;i<m;i++)
	{
		for( j=0;j<n;j++)
		{
		 b[i][j]=in.nextInt();
		}
	}
	System.out.println("first matrix");
	for( i=0;i<m;i++)
	{
		for( j=0;j<n;j++)
		{
	System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Second matrix");
	for( i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
	System.out.print(b[i][j]+" ");
		}
		System.out.println();
	
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("Added matrix");
	for( i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
	System.out.print(c[i][j]+" ");
		}
		System.out.println();
	
	}
}
}
