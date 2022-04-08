import java.util.*;

public class symmetric {
	public static void main(String[] args)
	{
		int m,i,j,flag=0;
		int[][] m2 = new int[10][10];
		while(true) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter size of matrix");
		m= in.nextInt();
		System.out.println("Enter matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				m2[i][j]=in.nextInt();
			}
		}
		for(i=0;i<m;i++){
	    	for(j=0;j<m;j++){
	    		System.out.print(m2[i][j]+" ");
	    	}
	    	System.out.println();
	    }
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				if(m2[i][j]!=m2[j][i])
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Matrix not symmetric");
			break;
		}
		else
		{
			System.out.println("Matrix symmetric");
		}
		}
	}
	}
