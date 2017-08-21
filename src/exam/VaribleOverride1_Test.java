package exam;

//作用域               当前类       同一package             子孙类       其他package
//public            √              √                  √           √
//protected         √              √                  √           ×
//friendly          √              √                  ×           ×
//private           √              ×                  ×           ×
//不写时默认为friendly

//通过运行结果发现：private的变量与其它三种访问权限变量的不同，这是由于方法的重写（override）而引起的。
//变量的值取决于我们定义的变量的类型，而不是创建的对象的类型。
//当变量类型是父类（ParentClass）时，不管我们创建的对象是父类（ParentClass）的还是子类（SubClass）的，都不存在属性覆盖的问题
//friendly、protected和public修饰符并不影响属性的覆盖。
class BaseClass {
	private String privateField = "父类变量--private";
	/* friendly */String friendlyField = "父类变量--friendly";
	protected String protectedField = "父类变量--protected";
	public String publicField = "父类变量--public";

	// private的变量无法直接访问，因此我们给他增加了一个访问方法
	public String getPrivateFieldValue() {
		return privateField;
	}
}

class Childclass extends BaseClass {
	private String privateField = "子类变量--private";
	/* friendly */String friendlyField = "子类变量--friendly";
	protected String protectedField = "子类变量--protected";
	public String publicField = "子类变量--public";

	// private的变量无法直接访问，因此我们给他增加了一个访问方法
	public String getPrivateFieldValue() {
		return privateField;
	}
	
}

public class VaribleOverride1_Test {

	public static void main(String[] args) {
		// 为了便于查阅，我们统一按照private、friendly、protected、public的顺序
		// 输出下列三种情况中变量的值
		// ParentClass类型，ParentClass对象
		BaseClass parentClass = new BaseClass();
		System.out.println("ParentClass parentClass = new ParentClass();");
		System.out.println(parentClass.getPrivateFieldValue());
		System.out.println(parentClass.friendlyField);
		System.out.println(parentClass.protectedField);
		System.out.println(parentClass.publicField);
		System.out.println();
		
		// SubClass类型，SubClass对象
		Childclass subClazz = new Childclass();
		System.out.println("SubClass subClazz = new SubClass();");
		System.out.println(subClazz.getPrivateFieldValue());
		System.out.println(subClazz.friendlyField);
		System.out.println(subClazz.protectedField);
		System.out.println(subClazz.publicField);
		System.out.println();
		
		// ParentClass类型，SubClass对象
		BaseClass subClass = new Childclass();
		System.out.println("ParentClass subClass = new SubClass();");
		System.out.println(subClass.getPrivateFieldValue());
		System.out.println(subClass.friendlyField);
		System.out.println(subClass.protectedField);
		System.out.println(subClass.publicField);
		
		
	}

}
