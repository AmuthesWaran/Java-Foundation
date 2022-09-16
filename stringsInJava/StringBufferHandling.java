package stringsInJava;

public class StringBufferHandling {

	public static void main(String[] args) {
					
			StringBuffer sb = new StringBuffer("Old Message");
			
			System.out.println(sb.hashCode());
			
			
			sb.append(" New Message");
			
			System.out.println(sb);
			
			System.out.println(sb.hashCode());
			
			
			StringBuffer sb4 = new StringBuffer("New Message");
			System.out.println(sb);
			
//			System.out.println(sb.hashCode());
//			
//			String s = sb.length();
//			System.out.println(s);
//		
			
//			String s = "test";
//			char mid = s.charAt(s.length()/2);
//			System.out.println(mid);
//			
//			char first = s.charAt(0);
//			char second = s.charAt(1);
//			char third = s.charAt(3);
//			char fourth = s.charAt(4);
			
			
			
			String name = "Amutheswaran";
			
			for (int i = 0; i < name.length(); i++) {
				
				char oneByone = name.charAt(i);
				System.out.println(oneByone);
				
			}
			
	
	}

}
