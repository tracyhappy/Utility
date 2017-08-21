package exam;

//即继承thread又实现runnable仍然能执行
public class Thread1_Test extends Thread implements Runnable {
	public void run() {
		System.out.println("this is run()");
	}

	public static void main(String args[]) {
		Thread t = new Thread(new Thread1_Test());
		t.start();
		new Thread1_Test().run();
		new Thread1_Test().start();
		
	}
}
