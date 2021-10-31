abstract class Bank{
	abstract void getbalance();
}
class BankA extends Bank{
	void getbalance() {
		System.out.println("$100 is Deposited in Bank A");
	}
}
class BankB extends Bank{
	void getbalance() {
		System.out.println("$150 is Deposited in Bank B");
	}
}
class BankC extends Bank{
	void getbalance() {	
		System.out.println("$200 is Deposited in Bank C");
	}
}
public class AbstractClassBankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA b1=new BankA();
		BankB b2=new BankB();
		BankC b3=new BankC();
		b1.getbalance();
		b2.getbalance();
		b3.getbalance();

	}

}
