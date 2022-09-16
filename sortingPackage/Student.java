
package sortingPackage;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private Integer sid;
	private String sName;
	private String location;
	public Student(int sid, String sName, String location) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sName=" + sName + ", location=" + location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, sName, sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(location, other.location) && Objects.equals(sName, other.sName) && sid == other.sid;
	}
//	@Override
//	public int compareTo(Student o) {
////		return this.sid-o.sid;
//		return this.sid.compareTo(o.sid);
//		//+ve 0 -ve
//	}
//	@Override
//	public int compareTo(Student o) {
//		return this.sName.compareTo(o.sName);
//	}
	
//	@Override
//	public int compareTo(Student o) {
//		return this.location.compareTo(o.location);
//	}
	
//	@Override
//	public int compareTo(Student o) {
//		return this.sName.length() - (o.sName).length() ;
//	}
//	
	
//	@Override
//	public int compareTo(Student o) {
//		return (o.sName).length() - this.sName.length();
//	}
	
	@Override
	public int compareTo(Student o) {
		return (o.sid) - this.sid;
	}
	
	
	
	
}
