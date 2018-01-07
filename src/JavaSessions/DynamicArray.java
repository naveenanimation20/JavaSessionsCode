package JavaSessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		//ArrayList
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("Hello");//2
		ar.add('m');//3
		ar.add(12.33);//4
		ar.add(true);//5
		
		System.out.println(ar.size());
		
		ar.add(300);//6
		ar.add(400);//7
		
		System.out.println(ar.size());
		ar.add(4, 22.33);
		System.out.println(ar.get(4));

		System.out.println(ar.get(1));
		//System.out.println(ar.get(8));//IndexOutOfBoundsException
		
		//to print all the values of arraylist: use for loop:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		ar.remove(6);
		System.out.println("the value of 6th position:"+ ar.get(6));
		
		ar.add("Naveen");//7
		
		//Generics:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		
	}

}
