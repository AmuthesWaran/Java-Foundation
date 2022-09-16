package oops.polymorphis.static_pm;

public class Student {
	private int sId;
	private String sName;
	private String schoolName;
	
	
	public Student()
			{
				 sId = 0;
				 sName = "Student 0";
				 schoolName = "Alpha";
			}
	
	public Student( String sName, String schoolName )
			{
				sId = 1;
				this.sName = sName;
				this.schoolName = schoolName;
				
			}
	
	public Student( int sId, String sName, String schoolName )
			{
				this.sId = sId;
				this.sName = sName;
				this.schoolName = schoolName;	
			}

	public void displayDetails()
			{
				System.out.println("Student Id\t: "+sId);
				System.out.println("Student Name\t: "+sName);
				System.out.println("School Name\t: "+schoolName);
				System.out.println();
			}
	
	
	
}
