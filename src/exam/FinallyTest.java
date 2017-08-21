package exam;

//finalize()方法是在GC（garbage collector）清理它所从属的对象时被调用的
public final class FinallyTest {
	// 重写finalize()方法
	protected void finalize() throws Throwable {
		System.out.println("执行了finalize()方法");
	}
	

	public static void main(String[] args) {
		FinallyTest ft = new FinallyTest();
		ft = null;        //必须有
		System.gc();
	}

	
}