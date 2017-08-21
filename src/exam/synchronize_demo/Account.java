package exam.synchronize_demo;

public class Account {
	//余额
	private int balance = 500;
	
	public int getBalance(){
		return balance;
	}
	
	//取款操作
	public void withDraw(int mount){
		balance -= mount;
	}
	
}
