package co1;
import java.util.*;
public class rectangle {
	float length,breadth,area;
 
	public void Area(float length,float breadth)
	{
		System.out.println("length:"+length);
		System.out.println("length:"+breadth);
		area=length*breadth;
		System.out.println("Area :"+area);
		System.out.println("Enter lenght of second rectangle");
		System.out.println("length:"+length);
		System.out.println("length:"+breadth);
		area=length*breadth;
		System.out.println("Area :"+area);
		
	}
 public static void main (String args[])
 {
	 System.out.println("Enter lenght of first rectangle");
	 Scanner m =new Scanner(System.in);
	 float length =m.nextInt();
	 float breadth =m.nextInt();
	 rectangle(length,breadth);
	
 }
}
