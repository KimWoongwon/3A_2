
public class Loop_01 
{
	int count;
	
	Loop_01()
	{
		count = 0;
	}
		
	public void Run()
	{
		for(int i = 1; i<=50; i++)
		{
			if(i % 3 == 0)
				++count;
		}
	}
	
	public void Print_Result()
	{
		System.out.println("ÃÑ " + count + "°³");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Loop_01 test = new Loop_01();
		
		test.Run();
		test.Print_Result();
	}

}
