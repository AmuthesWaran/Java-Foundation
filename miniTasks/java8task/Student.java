package miniTasks.java8task;

public class Student {
	
	
	private int sId;
	private String name;
	private String location;
	
	public Student(int sId, String name, String location) {
		super();
		this.sId = sId;
		this.name = name;
		this.location = location;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "sId: " + sId + " - name: " + name + ", location:" + location + "\n";
	}
	
	
	
	
	
}
