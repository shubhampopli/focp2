import java.util.Scanner;
class Box
{
	double width,depth,height;
	void setDim()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the dimensions w,d,h");
		width=in.nextDouble();
		height=in.nextDouble();
		depth=in.nextDouble();
	}
	double volume()
	{
		double vol=width*height*depth;
		System.out.println("Volume is"+vol);
		return vol;
	}
}
	class BoxDemo
	{
		public static void main(String args[])
		{
			Box obj=new Box();
			obj.setDim();
			double v=obj.volume();
		}
	}
