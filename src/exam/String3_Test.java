package exam;

public class String3_Test {

	public static void main(String[] args) {
		

		String ss = " Hello ";
		ss += " World ";
		ss.trim();
		String sss = ss.trim();
		System.out.println(ss);
		System.out.println(sss);

		
		String str="abc";	//创建了一个对象
		String a="abc";
		String b="abc";		//两行也只创建了一个对象
		String c="ab"+"cd";	//这一行也是只创建了一个对象相当于String c="abcd"
		
		String s =new String("abc"); //创建了两个String类型的对象:一个在堆中，一个在字符串常量池中。
		
		String str1=new String("abc");
		String str2=new String("abc");
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str1 == str2); //动态分配，各有各的地址
		System.out.println(str3 == str4); //都在常量池中，相同
		
		
		//字符串的不可变性
		String str5 = "你好";
		String str6 = "哈哈";
		str5 = str5.concat(str6);    //必须要赋给另一个string
		System.out.println(str5);    //此时str5与以前的str5的地址指向不一样
		
		StringBuffer str7 = new StringBuffer("oh");
		str7.append("yes");                 //自己自动扩大
		System.out.println(str7);  
		
		
		String str8 = "abc";                //str8,str9都在常量区。
		String str9 = "abc";
		if (str8 == str9){                 //地址比较
			System.out.println("相等");    //str8，str9地址指向相同
		}else{
			System.out.println("不相等");
		}
		
		//字符串的不可变性
		String temp = str8;
		str8 = "zxk4";                     //此时str8指向了另外一个存有“zxk”的地址空间
		if (str8 == temp){					 //地址比较
			System.out.println("相等");    
		}else{
			System.out.println("不相等");
		}
		
		//字符串的不可变性
		str2 = "d";								//"d"变得不可达
		str1 = "a";
		str2 = str1;
		str1 = str1 + "b";						//改变str1,不会影响到str2
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
