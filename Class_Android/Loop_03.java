
public class Loop_03
{
	int lowcount = 0;
	Loop_03()
	{
		lowcount = 0;
	}
	
	public void Run()
	{
		for (int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.printf("%4d",i);
				++lowcount;
			}
			if(lowcount == 10)
			{
				System.out.println();
				lowcount = 0;
			}
				
		}
	}
	
	public static void main(String[] args)
	{
		Loop_03 test = new Loop_03();
		test.Run();
		
	}

}
