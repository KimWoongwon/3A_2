import java.util.*;


class Student
{
	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	String GetName()
	{
		return name;
	}
	int GetAge()
	{
		return age;
	}
	String GetAddress()
	{
		return address;
	}
	
	void SetName(String name)
	{
		this.name = name;
	}
	void SetAge(int age)
	{
		this.age = age;
	}
	void SetAddress(String address)
	{
		this.address = address;
	}
	
}

public class Test
{
	ArrayList<Student> Student_List;
	Scanner sc;
	
	Test()
	{
		Student_List = new ArrayList<Student>();
		sc = new Scanner(System.in);
	}
	void Exit()
	{
		sc.close();
	}
	
	void PrintMenu()
	{
		System.out.println("1. �л����� �Է�");
		System.out.println("2. �Էµ� �л����� ���� ���");
		System.out.println("3. �л����� ����");
		System.out.println("4. �л����� ����");
		System.out.println("5. ���α׷� ����");
	}
	
	int Choice(int choice, int small, int big)
	{
		if(choice < small || choice > big)
			return -1;
		
		return choice;
	}
	
	boolean Add_StudentInfo()
	{
		String name;
		String address;
		int age;
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		if(name.length() >= 30)
			return false;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		if(age < 8 || age > 26)
			return false;
		
		System.out.print("�ּ� �Է� : ");
		sc = new Scanner(System.in);
		address = sc.nextLine();
		if(address.length() >= 100)
			return false;
		
		
		Student temp = new Student(name, age, address);
		Student_List.add(temp);
		
		return true;
	}
	
	void Print_ListAll()
	{
		int count = 0;
		for (Student student : Student_List)
		{
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, �ּ� : %s", count++, student.GetName(), student.GetAge(), student.GetAddress());
			System.out.println();
		}
		System.out.println();
		
	}
	
	boolean Update_StudentInfo(int choose)
	{
		if(choose == -1)
			return false;
		else
		{
			System.out.print("�̸� �Է�(�Է� ������ ���� ����) : ");
			String temp = sc.next();
			if(temp != "")
				Student_List.get(choose).SetName(temp);
									
			System.out.print("���� �Է�(0�Է½� ���� ����) : ");
			int age = sc.nextInt();
			if(age != 0)
				Student_List.get(choose).SetAge(age);
						
			System.out.print("�ּ� �Է�(�Է� ������ ���� ����) : ");
			sc = new Scanner(System.in);
			temp = sc.nextLine();
			if(temp != "")
				Student_List.get(choose).SetAddress(temp);
			
			return true;
		}
	}
	
	boolean Delete_StudentInfo(int choose)
	{
		if(choose == -1)
			return false;
		else
		{
			Student_List.remove(choose);
			return true;
		}
	}
	
	
	public void Run()
	{
		boolean endflag = true;
		
		while(endflag)
		{
			PrintMenu();
			System.out.print("�Է�: ");
			sc = new Scanner(System.in);
			
			switch (Choice(sc.nextInt(), 1, 5))
			{
				case 1:
				{
					boolean result = Add_StudentInfo();
					if(result)
						System.out.println("�����Դϴ�.");
					else
						System.out.println("�����Դϴ�.");
					break;
				}
				case 2:
				{
					Print_ListAll();
					break;
				}
				case 3:
				{
					Print_ListAll();
					
					System.out.println("������ ������ �л� ��ȣ�� �Է����ּ���.");
					int choose = Choice(sc.nextInt(), 0, Student_List.size());
					
					if(Update_StudentInfo(choose))
						System.out.println("�����Դϴ�.");
					else
						System.out.println("�����Դϴ�.");
					break;
				}
				case 4:
				{
					Print_ListAll();
					
					System.out.println("������ ������ �л� ��ȣ�� �Է����ּ���.");
					int choose = Choice(sc.nextInt(), 0, Student_List.size());
					
					if(Delete_StudentInfo(choose))
						System.out.println("�����Դϴ�.");
					else
						System.out.println("�����Դϴ�.");
					break;
				}
				case 5:
				{
					System.out.println("�ý����� ���� �մϴ�.");
					endflag = false;
					break;
				}
				default:
				{
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
			}
		}
		
	}

	public static void main(String[] args)
	{
		Test test = new Test();
		
		test.Run();
		test.Exit();
		
		
		
		

	}

}
