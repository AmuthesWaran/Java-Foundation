package oops.polymorphis.static_pm;

public class TeacherMain {

	private int teacherId;
	private String teacherName;
	private String schoolName;
	private String city;
	
	
	TeacherMain(int teacherId, String... strings)
			{
				this.teacherId = teacherId;
				teacherName = strings[0];
				schoolName = strings[1];
				city= strings[2];
			}	
	
	
	public void printDetails() 
			{
				System.out.println("Teacher ID\t: "+teacherId);
				System.out.println("Teacher Name\t: "+teacherName);
				System.out.println("School Name\t: "+schoolName);
				System.out.println("City\t\t: "+city);
			}
	
	
	public static void main(String[] args) {
		TeacherMain teacher = new TeacherMain(0, "Teacher 1", "Alpha", "Chennai");
			teacher.printDetails();
		
	}

}
