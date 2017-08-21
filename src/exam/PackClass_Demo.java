package exam;

public class PackClass_Demo {

	public static void main(String[] args) {
		Integer a = new Integer(5);
		Integer b = new Integer(5);
		
		System.out.println(a.equals(b));        //true   比较的是值
		System.out.println(a==b);       	    //false  比较的是地址
		
		
		//-128 到127之间的值会做缓存处理。前面相等，后面不相等。超过这个范围就会new Integer
		Integer a1 = 127;						//这里不是new
		Integer a2 = 127;

		Integer b1 = 1000;
		Integer b2 = 1000;

		System.out.println(a1==a2);				//true			
		System.out.println(b1==b2);				//false
	}

}
