
public class Student {
//	instance variable
	private int roll;
	private String name;
	private String courseName;
	private int marks;
	
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public void input(int roll,String name,String courseName,int marks)
	{
		if (roll >0){
			this.roll=roll;
			
		}
		this.name=name;
		this.courseName=courseName;
		
		if (marks > 0)
		{
		this.marks=marks;
		}
	}
	
	
	public void print()
	{
		System.out.println(this.roll);
		System.out.println(this.name);
		System.out.println(this.courseName);
		System.out.println(this.marks);
//		System.out.println("*******************************");
//		Vishalchauhan8979532763 @gmail
	}
}
