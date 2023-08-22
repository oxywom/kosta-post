public class Account {
	String id;
	String name;
	int balance;
	Account() {}
	Account(String aid, String aname, int money) {
		id=aid;
		name=aname;
		balance=money;
	}
	
	String info() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id,name,balance);
	}
	void deposit(int money) {
		balance += money;
	}
	void withdraw(int money) {
		if(balance>=money) {
			balance-=money;
		}
	}
}
