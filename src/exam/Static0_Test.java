package exam;

import java.util.Vector;

public class Static0_Test {
   //所有类的实例都共享一个静态变量。其中一个实例将该变量进行改变，则其他实例的该变量也改变了
	private static int i; 
	private static Vector<Integer> usernameVector = null; 
	
	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Static0_Test.i = i;
	}
	
	public static Vector<Integer> getUsernameVector() {
		return usernameVector;
	}

	public static void setUsernameVector(Vector<Integer> username) {
		Static0_Test.usernameVector = username;
	}

	public static void main(String[] args) {
		Static0_Test obj1 = new Static0_Test();
		Static0_Test obj2 = new Static0_Test();
		Vector<Integer> usernameVec = new Vector<Integer>();
		usernameVec.add(111);
		usernameVec.add(222);
		usernameVec.add(333);
		
		obj1.setI(3);
		obj1.setUsernameVector(usernameVec);
		System.out.println("obj1的i :" + obj1.getI());
		System.out.println("obj2的i :" + obj2.getI());
		System.out.println("obj1的usernameVector :" + obj1.getUsernameVector());
		System.out.println("obj2的usernameVector :" + obj2.getUsernameVector());
		
		Static0_Test.setI(2);
		usernameVec.add(999);
		Static0_Test.setUsernameVector(usernameVec);
		System.out.println("obj1的i :" + obj1.getI());
		System.out.println("obj2的i :" + obj2.getI());
		System.out.println("obj1的usernameVector :" + obj1.getUsernameVector());
		System.out.println("obj2的usernameVector :" + obj2.getUsernameVector());
	}
}

