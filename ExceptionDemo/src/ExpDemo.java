
public class ExpDemo {

	public static void main(String[] args) {

			int res = 0;
		
		System.out.println("Open File");

		System.out.println("Write data");
		try {
		 res = ExpDemo.div(6, 2);
		 System.out.println(res);
		} 		finally {
			
			System.out.println("Close File");	
			
		}
		
		System.out.println(res);
		

		System.out.println("Thank u");

	}

	public static int div(int a, int b) throws ArithmeticException {

		return a / b;

	}

}
