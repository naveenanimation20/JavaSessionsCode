package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "The rains have started here selenium";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(26));
		//System.out.println(s.charAt(27));//StringIndexOutOfBoundsException
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('s'));//8 -- 1st occurrence of s
		System.out.println(s.indexOf('s', s.indexOf('s')+1));//15 -- 2nd occurrence of s
		System.out.println(s.indexOf('s', s.indexOf('s', s.indexOf('s')+1)+1));//15 -- 3rd occurrence of s

		
		System.out.println(s.indexOf("have"));
		System.out.println(s.indexOf("hello")); //-1
		
		String s1 = "The rains Have started here";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		//trim:
		String str = "     Hello   World   ";
		System.out.println(str.trim());
		
		//replace:
		String date = "01-01-2018"; //01/01/2018
		System.out.println(date.replace('-', '/'));
		
		String s3 = "Hello World";
		System.out.println(s3.replace(" ",""));
		
		//sub string:
		String s4 = "The rains have started here";
		System.out.println(s4.substring(0, 9));

		//split:
		String s5 = "Hello_Selenium_Testing";
		String arr[] = s5.split("_");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String h = "XxTestXxTestXxXtesting";
		String d[] = h.split("Xx");
		for(int i=0; i<d.length; i++){
			System.out.println(i+"-->"+d[i]);
		}

		String firstName = "Tom;Naveen;Felix;Ipsi;Sharmi";
		String firstName1[] = firstName.split(";");
		for(int i=0; i<firstName1.length; i++){
			System.out.println(firstName1[i]);
		}
		
		
		
	}

}
