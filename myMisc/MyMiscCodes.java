package myMisc;

public class MyMiscCodes {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
