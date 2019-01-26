import java.util.*;
import java.lang.*;

class Pts
{
	static private double x1,x2,y1,y2;

	static void set()
	{
		System.out.println("Enter value of x1, y1, x2, y2");
		Scanner input = new Scanner(System.in);
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
	}
	static public void Distance()
	{
		double dist;
		dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.println(dist);	
	}
	
}

class StaticDist
{

	public static void main(String args[])
	{
		Pts.set();
		Pts.Distance();
	}
}