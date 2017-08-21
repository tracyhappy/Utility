package exam;

//以下哪些表达式返回为真（ADEF）（多选）
//String a=”My field1”;
//String b=”My field1”;
//String c=new String(”My field1”);
//String d=new String(”My field1”);
//a)	a==b   常量区
//b)	a==c
//c)	c==d
//d)	a.equals(b)
//e)	a.equals(c)
//f)	c.equals(d)

public class String1_Test {
	String str=new String("good"); 
	char[]ch={'a','b','c'}; 
	
	//String，Math为final类。不可继承。string不可变形,赋值拼接相当于另一个地址
	public void change(String str,char ch[]){ 
		str="test ok";  
		ch[0]='g'; 
		int i;
//	    System.out.println(i);         //编译出错。局部变量使用前必须赋值
	} 
	
	public static void main(String[] args) {
		String1_Test ex=new String1_Test(); 
		ex.change(ex.str,ex.ch); 
		System.out.print(ex.str+" and "); 
		System.out.print(ex.ch); 
	}

}
