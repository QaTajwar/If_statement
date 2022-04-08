package if_statement;

public class If_statement { 
	public static void main(String []args) {
		int age = 10 ; 
		
		
		if(age>=18) {
			System.out.println("You are an adult!");
		}
		else if(age>=12 || age==16){
			System.out.println("You are a teenager!");
		}
		
		else{
			System.out.println("You are not an adult!");
		}
		
		
		
	}

}
