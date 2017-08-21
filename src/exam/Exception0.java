package exam;

//在try中或者catch中有return，都会先执行finally再return。如果finally中也有return则直接结束。
//如果是System.out.exit(0)则直接退出了,不会再进入finally。因此finally不是必须执行的。

public class Exception0 {

	public static String output = ""; // 13423

	public static void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			output += "1";
		} catch (Exception e) {
			output += "2";
			return;
		} finally {
			output += "3";
		}
		output += "4";
	}

	public static void main(String args[]) {
		foo(0);
		foo(1);
		System.out.println(output);
		
		
		//另一道题，输出结果为？？？？
		int a[] = {0,1,2,3,4};
        int sum=0;
        try{
        	for(int i=0;i<6;i++)
        	{
        		sum+=a[i];
        	}
        	System.out.println("sum="+sum);
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
        	System.out.println("数组下标越界");
        }finally{
        	System.out.println("程序结束");
        }
        
        
        
        //另一道题  
        try{
			System.out.println("hello,jr");
			System.exit(0);                 //直接退出不执行finally
		}finally{
			System.out.println("88");
		}

	}
}
