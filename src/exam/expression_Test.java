package exam;

//这段程序执行完后，c与result的值是
public class expression_Test {
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		boolean c = (a && b) && (!b);
		int result = c == false ? 1 : 2;
		System.out.println("c :" + c);
		System.out.println("result :" + result);

		String x = null;
		int y = (x != null) && (x.length() > 0) ? x.length() : 0;  //表达式合法
		
//		(x == null)?getVar(1):getVar(2); 							//三元表达式不能有这种写法
//		int tt = (x == null) ? getVar(1) : getVar(2); 				//三元表达式其实是赋值语句，必须有赋值

	}
	
	int var=100;
	//static int getVar() {
		//return var;		//编译错误
	//} 
	
	static int getVar(int var) {
		return var;		
	} 

}
