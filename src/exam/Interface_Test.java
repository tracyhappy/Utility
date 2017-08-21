package exam;

//接口中可以无方法。
//如果有方法只能是抽象方法。
//接口中的抽象方法修饰符只能是public。
//接口中如果有属性只能为public static final。且必须赋值。
//一个抽象类可以实现一个接口，此时抽象类可以去实现接口的一些方法，比如适配器模式，也可以不实现。那么对于抽象类的子类再去实现抽象类和接口中剩余的抽象方法。

//能用来修饰interface的修饰符有（public,不加修饰符 ）

public interface Interface_Test {
	//void play();
	int j=0;
//	int i;			//必须初始化     
}

//接口只能继承（extends）接口
interface q extends Interface_Test{
	
}