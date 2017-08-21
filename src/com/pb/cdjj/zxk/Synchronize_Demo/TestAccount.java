package com.pb.cdjj.zxk.Synchronize_Demo;

public class TestAccount implements Runnable {
	private Account account = new Account();
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//取款
			makeWithDraw(100);
			if (account.getBalance() < 0) {
				System.out.println("账户透支了");
			}
		}

	}
	
	/**
	 * 加上synchronized,不加会读取错误,进行错误操作
	 */
	private synchronized void makeWithDraw(int mount){
		System.out.println(Thread.currentThread().getName() + "看到账户的余额为" + account.getBalance());
		//判断当前余额是否足够
		if (account.getBalance() >= mount) {
			System.out.println(Thread.currentThread().getName() + "准备取款");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("取之前余额为" + account.getBalance());
			account.withDraw(mount);
			System.out.println(Thread.currentThread().getName() + "完成取款");
			
		}else{
			System.out.println("余额不足以支付" 
			+ Thread.currentThread().getName() + "的取款，余额为：" + account.getBalance());
		}
	}
}
