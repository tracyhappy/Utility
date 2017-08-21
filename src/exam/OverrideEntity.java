package exam;
/**
 *  重载是静态绑定
 *	重写是动态绑定 : 向上转型,只能调用父类的函数和子类重写的函数,不能调用子类独有的函数
 */
public class OverrideEntity {
	
//	@Override
//	public boolean equals(Object other){
//		System.out.println("1.Entity equals method reach");
//		return true;
//	}
	
//  这里的equals并没有覆盖Object类中的equals成功。实际上是重载成功了。因此加上@Override来检测比较好。
	public boolean equals(OverrideEntity other){
		System.out.println("2.Entity equals method reach");
		return true;
	}
	
	public static void main(String[] args) {
		Object obj1 = new OverrideEntity();
		Object obj2 = new OverrideEntity();
		
		OverrideEntity obj3 = new OverrideEntity();
		OverrideEntity obj4 = new OverrideEntity();
		
		if(obj1.equals(obj2)){						//false。调用的是Object中的equals
			System.out.println("obj1 equals obj2");
		}
		
		if(obj3.equals(obj4)){						//true。调用的是Entity中的equals
			System.out.println("obj3 equals obj4");
		}
	}
	
}
