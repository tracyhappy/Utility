package strategy;
/**
 * 此类用于维护策略类的引用
 *
 */
public class Context {
	//持有的策略类引用
	private Account account;
	//构造方法，实例化策略类应用
	public Context (Account account){
		this.account = account;
	}
	//调用策略方法
	public float doAccount(int amount,int price){
		return account.getFactPrice(amount, price);
	}
}
