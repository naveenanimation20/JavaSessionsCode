package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 200;
		int b = 300;
		
		//= vs ==
		if(a==b){
			System.out.println("a and b are equal");
		}
		else{
			System.out.println("a and b are not equal");
		}
		
		if(b>a){
			System.out.println("b is greater than a");
		}else{
			System.out.println("a is greater than b");
		}
		
		if(b>=a){
			System.out.println("b is greater than equal to a");
		}
		
		//< > <= >= <> !=
		int c = 10;
		int d = 20;
		if(c!=d){
			System.out.println("c is not equal to d");
		}
		
		//WAP to print the highest number (given three variables)
		int x = 500;
		int y = 400;
		int z = 600;
		
		if(x>y && x>z){ //true && false
			System.out.println("x is the highest number");
		}
		else if(y>z){//false
			System.out.println("y is the highest number");
		}
		else{
			System.out.println("z is the highest number");
		}
		
		
		
		
		
	}

}
