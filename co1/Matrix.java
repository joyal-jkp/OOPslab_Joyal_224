package co1;
import java.util.*;
public class Matrix {

public static void main(String args[])
{ 
	int m,n;
	int a[][] = new int[10][10];
	int b[][] = new int[10][10];
	Scanner in =new Scanner(System.in);
	System.out.println("Enter row value of matrix-1");
	m= in.nextInt();
	System.out.println("Enter column value of matrix-1");
	n=in.nextInt();
	System.out.println("Enter array one elements");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		 a[i][j]=in.nextInt();
		}
	}
	System.out.println("Enter arrray two elements");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		 b[i][j]=in.nextInt();
		}
	}
	System.out.println("first matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
	System.out.println(a[i][j]+" ");
		}
	}
	System.out.println("Second matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
	System.out.println(b[i][j]+" ");
		}
	
	}
}
}
