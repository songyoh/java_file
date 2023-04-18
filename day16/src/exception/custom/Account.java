package exception.custom;

public class Account {

	private long balance; // 멤버변수
	
	public long getBalance() {//Balance값을 조회
		return this.balance;
	}
	
	public void deposit(int money) throws DepositMinusMoneyException {//setter의 성질을 가짐
		if(money < 0) {
			throw new DepositMinusMoneyException("음수로 입금이 불가합니다.");
		}
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{//예금 출금
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔액이 부족합니다.");
		}
		this.balance -= money;
	}
}
