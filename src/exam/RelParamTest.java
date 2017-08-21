package exam;

//对于引用类型，在方法体内对方法参数进行重新赋予引用，并不会改变原有变量所持有的引用。
//在8种基本类型被作为参数传递给方式时，是值传递
public class RelParamTest {
	// 初始值为0
	private int num = 0;

	// 为方法参数重新赋值
	public void change(RelParamTest t) {
		RelParamTest tmp = new RelParamTest();
		tmp.num = 9;
		t.num =10;
		t = tmp;
		t.num = 11;
	}
	
	public void add(RelParamTest t){
		t.num += 3;
	}

	public static void main(String[] args) {
		RelParamTest t = new RelParamTest();
		System.out.println("运算之前：" + t.num);
		// 为引用型参数重新赋值
		t.change(t);
		System.out.println("方法中重新赋予引用，运算之后：" + t.num);
		
		t.add(t);
		System.out.println("方法中改变引用的属性，运算之后：" + t.num);
	}
}