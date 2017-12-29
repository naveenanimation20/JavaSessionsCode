package JavaSessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {

		int i = 1;
		int j = i++; //post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int m = 1;
		int n = ++m; //pre increment
		
		System.out.println(m);//2 2 2 2 2 2 2
		System.out.println(n);//2 2 2 2 2 2 2
		
		int p = 2;
		int q = p--; //post decrement
		System.out.println(p); //1 1 1 1 1 1 1
		System.out.println(q); //0 2 2 2 2 2 2
		
		int c = 2;
		int d = --c; //pre decrement
		System.out.println(c); //1
		System.out.println(d); //1
	}

}
