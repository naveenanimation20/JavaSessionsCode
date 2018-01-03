package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//limitations of array:
		//1. size is fixed: static array -- to overcome this issue: we use dynamic array -- ArrayList
		//2. stores only similar data types values -- to overcome this issue: we use object array
		
		//1. int:
		int d1[] = {10,20,30,40,50}; //sorted
		String s1[] = {"test", "selenium", "automation"};
		char c1[] = {'a', 'b', 'c'};
			
		int i[] = new int[3];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		
		System.out.println(i[1]);
		System.out.println(i[0]+i[1]);
		//System.out.println(i[3]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //size of array
		//to print/traverse/iterate all the values of array: use for loop:
		for(int k=0; k<i.length; k++){
			System.out.println(i[k]);
		}
		
		
		//2. double:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=23.33;
		
		//3. char:
		char c[] = new char[3];
		
		//4. boolean:
		boolean b[] = new boolean[2];
		
		//5. String:
		String s[] = new String[3];
		s[0]="Tom";
		s[1]="test";
		s[2]="selenium";
		
		//6. Object array:
		Object ob[] = new Object[4];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]='M';
		ob[3]=12.33;
		
		for(int p=0; p<ob.length; p++){
			System.out.println(ob[p]);
		}
		
		
	}

}
