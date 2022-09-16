package oops.classes;

public class Student2 {

	private int sId;
	private String sName;
	private String loc;
	
	
	// Default Constructor
	public Student2() 
	{
		sId = 0;
		sName = "Name";
		loc = "Chennai";
	}
	//Parameter Constructor
	public Student2(int sId, String sName, String loc) 
	{
		this.sId = sId;
		this.sName = sName;
		this.loc = loc;
	}

	
	// right click -> source -> generate getters and setters;
	
	//setter method
	public void setSId(int sId)
	{
		this.sId = sId;
	}
	
	
	
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	
	
	
	public void setLoc(String loc)
	{
		this.loc = loc;
	}
	
	
	public void DisplayDetails()
			{
				System.out.println("Student ID\t: "+sId);
				System.out.println("Student Name\t: "+sName);
				System.out.println("Location\t: "+loc);
			}



	//getter method
	public int getSId() {
		return sId;
	}



	public String getSName() {
		return sName;
	}


	public String getLoc() {
		return loc;
	}
	
	
}
