package fileHandling_serialization_deserialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	int sid;
	String sName;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Student(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}
	
	public Student() {
		
	}
	
	
	
	
	
}
