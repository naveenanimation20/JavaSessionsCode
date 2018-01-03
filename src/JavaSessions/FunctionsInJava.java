package JavaSessions;

public class FunctionsInJava {

	public static void main(String[] args) {

		//object of the class: new keyword
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int k = obj.div();
		System.out.println("div is:"+ k);
		
		String s1 = obj.PQR();
		System.out.println(s1);
		
		int mul = obj.multiply(10, 20);
		System.out.println("multiply is:"+ mul);
		
		int mul1 = obj.multiply(20, 30);
		System.out.println("multiply is:"+ mul1);

	}
	//function can not be created inside a function
	//functions are independent to each other or parallel to each other
	
	//method overloading: within the same class, if there are number of methods having the same method name but different parameters.
	public void sum(){ //0 param
		System.out.println("sum with zero param");
	}
	
	public void sum(int i){ //1 param
		
	}
	
	public void sum(int i, int j){ //2 params
		
	}
	
	public void sum(String p, String q){ //2 params
		
	}
	
	
	//1. no ip and no op
	//void --> does not return any value
	public void test(){
		System.out.println("test method");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is:"+c);
	}
	
	//2. no ip but some op
	public int div(){
		System.out.println("div method");
		int p = 30;
		int q = 10;
		int r = p/q;
		
		return r;
	}
	
	public String PQR(){
		System.out.println("multiply method");
		String s = "Selenium";
		return s;
	}
	
	//3. some ip and some op
	public int multiply(int m, int n){
		System.out.println("multiply method");
		int l = m * n;
		return l;
	}
	
	

}
