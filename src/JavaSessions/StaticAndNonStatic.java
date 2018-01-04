package JavaSessions;

public class StaticAndNonStatic {
	
	//class vars, global vars
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {

		//1. call non static members:
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		obj.sum();//warning
		
		//2. call static members
		//a. direct calling:
			sum();
			System.out.println(age);
		//b. call by class name:
			StaticAndNonStatic.sum();
			System.out.println(StaticAndNonStatic.age);
		
	}
	
	public void sendMail(){
		System.out.println("send mail method");
	}
	
	public static void sum(){
		System.out.println("sum method");
	}
	
	
	

}
