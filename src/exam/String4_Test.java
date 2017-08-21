package exam;


public class String4_Test {
	//String，Math为final类。不可继承。string不可变性,赋值拼接相当于另一个地址
	 public static void stringReplace(String text){ 
	     text=text+"c";
	 } 
	 public static void bufferReplace(StringBuffer text){ 
		 text=text.append("c"); 
	 }
	/**
	 * 类的修饰符只能为public,不写,final,abstract
	 */
	public static void main(String[] args) {
//		char a[]="hefg";  //不能這樣定义char数组
		
		String textString=new String("java"); 
        StringBuffer textBuffer=new StringBuffer("java"); 
        stringReplace(textString); 
        bufferReplace(textBuffer); 
        System.out.println(textString+textBuffer); 
        
        
        //StringBuffer,StringBuilder都没有重写equals方法,比较的是地址
        StringBuffer test1 = new StringBuffer("abc");
		StringBuffer test2 = new StringBuffer("abc");
		
		if(test1.equals(test2)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	}
}

	   
	       
