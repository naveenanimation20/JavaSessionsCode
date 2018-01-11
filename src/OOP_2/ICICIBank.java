package OOP_2;

public class ICICIBank implements USBank, UKBank{
	
	//USBank
	public void debit(){
		System.out.println("ICICI--debit");
	}
	
	public void credit(){
		System.out.println("ICICI--credit");
	}
	
	public void transferMoney(){
		System.out.println("ICICI -- tr money");
	}
	
	//UKBank
	public void atmCard(){
		System.out.println("ICICI--atm card");
	}
	
	public void trading(){
		System.out.println("ICICI--trading");
	}
	
	
	
	///
	public void educationLoan(){
		System.out.println("ICICI -- edu loan");
	}
	
	public void homeLoan(){
		System.out.println("ICICI--home loan");
	}
	
	
	
	

}
