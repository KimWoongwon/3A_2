

public class Loop_04
{
	int[][] arr;
	Loop_04()
	{
		arr = new int[5][4];
	}
	
	public void Run()
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++)
			{
				arr[i][j] = (j+1) + i*arr[0].length;
			}
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
		Loop_04 test = new Loop_04();
		test.Run();
		test.Print_Result();
	}

}
