import java.util.*;
class AreaSquare
	{
		int side, area;
		AreaSquare()
		{
			this.side=0;
			System.out.println("Default constructor");

		}
		AreaSquare(int x)
		{
          this.side=x;
		}
		void display()
		{
		
		area=side*side;
		System.out.println("area is"+area);
	}

	}
 
public class Test
{
	public static void main(String args[])
     
     {
     	    AreaSquare obj = new AreaSquare();	     
     		
     		obj.display();

     	Scanner si=new Scanner(System.in);
     	System.out.println("enter side");
	 int l=si.nextInt();
     		AreaSquare obj1 = new AreaSquare(l);

     		obj1.display();

     	
     }
}