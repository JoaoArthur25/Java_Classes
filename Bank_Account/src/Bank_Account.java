
public class Bank_Account {
	String name;
	double balance = 0;
	
	public Bank_Account(double value, String name) {
    	this.name = name;
        if (value >= 0) {
            this.balance = value;
        } else {
            throw new IllegalArgumentException();
        }
    }
	
	public  double withdraw(double valor) {
		if(valor > balance) {
			throw new IllegalArgumentException();
		}
		balance -= valor;
		return balance;
	}
	
	public  double deposit(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException();
		}
		else {
			balance += valor;
			return balance;
		}
	}
	
	public double showTotalBalance() {
		return balance;
	}

}
