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
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 입력된 학생들의 정보 출력");
		System.out.println("3. 학생정보 수정");
		System.out.println("4. 학생정보 삭제");
		System.out.println("5. 프로그램 종료");
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
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		if(name.length() >= 30)
			return false;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		if(age < 8 || age > 26)
			return false;
		
		System.out.print("주소 입력 : ");
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
			System.out.printf("번호 : %d, 이름 : %s, 나이 : %d, 주소 : %s", count++, student.GetName(), student.GetAge(), student.GetAddress());
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
			System.out.print("이름 입력(입력 없을시 수정 없음) : ");
			String temp = sc.next();
			if(temp != "")
				Student_List.get(choose).SetName(temp);
									
			System.out.print("나이 입력(0입력시 수정 없음) : ");
			int age = sc.nextInt();
			if(age != 0)
				Student_List.get(choose).SetAge(age);
						
			System.out.print("주소 입력(입력 없을시 수정 없음) : ");
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
			System.out.print("입력: ");
			sc = new Scanner(System.in);
			
			switch (Choice(sc.nextInt(), 1, 5))
			{
				case 1:
				{
					boolean result = Add_StudentInfo();
					if(result)
						System.out.println("성공입니다.");
					else
						System.out.println("실패입니다.");
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
					
					System.out.println("정보를 수정할 학생 번호를 입력해주세요.");
					int choose = Choice(sc.nextInt(), 0, Student_List.size());
					
					if(Update_StudentInfo(choose))
						System.out.println("성공입니다.");
					else
						System.out.println("실패입니다.");
					break;
				}
				case 4:
				{
					Print_ListAll();
					
					System.out.println("정보를 삭제할 학생 번호를 입력해주세요.");
					int choose = Choice(sc.nextInt(), 0, Student_List.size());
					
					if(Delete_StudentInfo(choose))
						System.out.println("성공입니다.");
					else
						System.out.println("실패입니다.");
					break;
				}
				case 5:
				{
					System.out.println("시스템을 종료 합니다.");
					endflag = false;
					break;
				}
				default:
				{
					System.out.println("잘못된 입력입니다.");
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
