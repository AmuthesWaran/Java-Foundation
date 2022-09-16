package operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		float mark1, mark2;
		
		mark1 = 91;
		mark2 = 94;
		
		String result = (mark1==mark2)? "Mark1 and Mark2 are equal" : (mark1>mark2)? "Mark1 is Greater"  : "Mark2 is Greater";
		System.out.println(result);
		
		
		
	}

}
