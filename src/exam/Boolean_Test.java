package exam;


//if(括号里必须是boolean类型)		

public class Boolean_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean flag = true;
		if (flag = false) {		  //编译不出错,相当于赋值。if(这里只能是boolean类型)
			System.out.println(flag);
		}else{
			//执行这一句
			System.out.println(flag);
		}
		
		int c = 1;
		int d = 1;
//		if (c = d) {              //编译出错
//			System.out.println("相等");
//		}else{
//			System.out.println("不相等");
//		}
		
//		if (c = 5) {			  //编译出错
//			System.out.println("p");
//		}else{
//			System.out.println("q");
//		}

	}

}
