package comcg.di;

public class Student 
{
	//variable
	private String StudentName;
	private int rollno;
	
	//DI using Constructor
	//constructor argument name should pass in beans.xml
	public Student(String studentName, int rollno) {
		super();
		StudentName = studentName;
		this.rollno = rollno;
	}
	
   /* //DI using setters

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}*/
	
	//user define method
	public void display()
	{
		System.out.println("StudentName is :"+StudentName+" "+"and Roll NO is :"+rollno);
	}

	


	

}
