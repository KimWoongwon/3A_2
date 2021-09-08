
public class Loop_02
{
	float sum;
		
	Loop_02()
	{
		sum = 0;
	}
	
	public void Run()
	{
		for (int i = 1; i <= 10; i++)
		{
			float result = 1.0f / i;
			sum += result;
		}
	}
	
	public void Print_Result()
	{
		System.out.println("°á°ú°ª : " + sum);
	}
	

	public static void main(String[] args)
	{
		Loop_02 test = new Loop_02();
		test.Run();
		test.Print_Result();

	}

}
