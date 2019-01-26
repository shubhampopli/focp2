import java.util.*;
class AreaSquare
	{
		int side, area;
		void display()
		{
		Scanner si=new Scanner(System.in);
		side=si.nextInt();
		area=side*side;
		System.out.println("area is"+area);
	}

	}
 
public class Test
{
	public static void main(String args[])
     
     {
     	AreaSquare obj = new AreaSquare();
     	     
     		//System.out.println("area is"+area);
     		obj.display();

     	
     }
}