package understandingSingleton;

public class MainClass {
	public static void main(String[] args) {
		
		Mentor mentor1 = Mentor.getInstance();
		Mentor mentor2 = Mentor.getInstance2();
		
		System.out.println(mentor1);
		System.out.println(mentor2);
		
	}

}
