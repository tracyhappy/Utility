package exam;

//静态变量和静态块只会初始化一次。先于所有对象的创建。
public class Static3_Test {

	static int i = 1;   
	static {
		System.out.println("aaaaaaaaaaaaa");
		i++; 			
	}

	public Static3_Test() {
		System.out.println("bbbbbbbbbbbbb");
		i++;
	}

	public static void main(String[] args) {
		Static3_Test t1 = new Static3_Test();
		System.out.println(t1.i); 				// 3
		Static3_Test t2 = new Static3_Test();
		System.out.println(t2.i); 				// 4
	}
}
