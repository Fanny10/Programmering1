package exercises.oop;

public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		this.amount = this.balance;
		return balance;
		
	}

	public int debit(int amount) {
		
	}

	public int transferTo(Account another, int account) {
		

	}

	public String toString() {
		return "Account[id=" + this.id + ", name= " + this.name + " " + this.balance + "]";

	}
}
