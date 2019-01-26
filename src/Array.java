import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of class");
		n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("array length is"+marks.length);
		System.out.println("Enter "+n+"elements");
		for (i=0;i<marks.length;i++)
		{
			System.out.println("the value for "+i+"is");
           marks[i]=sc.nextInt();
		}
    }
}