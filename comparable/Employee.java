package comparable;

public class Employee 
{
	int id;
	String name;
	int age;
	
	Employee(int id, String name, int age)
			{
				this.id = id;
				this.name = name;
				this.age = age;
			}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
