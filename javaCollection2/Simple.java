package javaCollection2;
import java.util.*;

public class Simple {

	
		public static void main(String args[])
		{
			ArrayList al=new ArrayList();
			al.add(new Student(101,"Rohit", 25));
			al.add(new Student(102,"Sumit", 27));
			al.add(new Student(103,"Shivam", 20));
		
			//Collections.sort(al);
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				Student st=(Student)itr.next();	
				System.out.println(st.rollno+" "+st.name+" "+st.age);	
			}
		}
		
	

}
