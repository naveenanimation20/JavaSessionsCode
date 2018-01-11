package OOP_2;

public class TestBank {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();
		ic.credit();
		ic.debit();
		ic.transferMoney();
		
		ic.atmCard();
		ic.trading();
		
		ic.educationLoan();
		ic.homeLoan();
		
		USBank usb = new ICICIBank();
		usb.credit();
		usb.debit();
		usb.transferMoney();
		
		System.out.println(USBank.min_bal);
		
		
		
	}

}
