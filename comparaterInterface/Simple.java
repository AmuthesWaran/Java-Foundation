package comparaterInterface;

import java.util.*;

public class Simple {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Student(101,"Sumit",21));
		al.add(new Student(102,"Vipul",25));
		al.add(new Student(103,"Shivam",30));
		System.out.println("Sorting by Name.....");
		
	
		Collections.sort(al,new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

		System.out.println("sorting by age......");
		
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student st=(Student)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		
	}

}
