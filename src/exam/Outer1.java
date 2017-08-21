package exam;

public class Outer1 {
	private int i;
	private static int j;
	
	class Inner{
		Inner(){
			System.out.println(i);
		}
	} 
	
	static class Innerr{
		Innerr(){
			System.out.println(j);
		}
	} 
	
	public static void main(String[] args) {
//		new Inner();				//非静态内部类相当于非静态成员变量
		new Innerr();				//静态内部类相当于静态变量
	}
	
	public void test(){
		new Inner();
		new Innerr();
	}
}
