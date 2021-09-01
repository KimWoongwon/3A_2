

public class Loop_05
{
	int[][] arr;
	int count;
	Loop_05()
	{
		arr = new int[5][5];
		count = 0;
	}
	
	public void Run()
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(++count > 5)
					arr[i][j] = 0;
				else
					arr[i][j] = count;
			}
			count = i + 1;
		}
	}
	
	public void Print_Result()
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Loop_05 test = new Loop_05();
		test.Run();
		test.Print_Result();
	}

}
