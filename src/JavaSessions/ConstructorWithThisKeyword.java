package JavaSessions;

public class ConstructorWithThisKeyword {
	
	//class vars
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
	}

}
