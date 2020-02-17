
public class DemoExp {

	public static void main(String[] args) {
	
	int account[] = {101,102,103,104};	
	
	String[] names = {"king","tom","smith","ravi"};
	
	double  []amount = {900,8000,7000,3000};
	
	
				System.out.println("ACNO  NAMES   AMOUNT");
				
				for (int i = 0; i < account.length; i++) {
					
	System.out.println(account[i]+"     "+names[i]+"   "+amount[i]);
					
					if(amount[i] < 1000) {
						
						try {
						throw new LowBalException();
						}
						catch(LowBalException be) {
							
							System.err.println(names[i]+" Sorry ur balance is low"+amount[i]+"plz credit some amount");
							
						}
					}
	
	
				}
					
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
