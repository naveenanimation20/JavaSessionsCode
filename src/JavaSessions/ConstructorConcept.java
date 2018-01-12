package JavaSessions;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default const");
	}

	public ConstructorConcept(int i) {
		System.out.println("single param constructor");
		System.out.println("the value of i " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("two params constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);

	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}

}
