class IllegalArgument
{
	public static void main (String args[])
	{
		try
		{
			switch(5 )
			{
				case 1: System.out.println("Case 1");
				default: throw new IllegalArgumentException("Invalid expression");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}