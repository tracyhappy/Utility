package duotai.duotai2;

/**
 * 
 * 功能：导演类 - 模拟业务类（实现动作action）
 * 作者：张学恺
 */
public class Director {
	private String name;
	
	public Director() {}

	public Director(String name) {
		this.name = name;
	}
	
	/**
	 * 实现方法action
	 * @param actor 演员对象
	 */
	public void action(Actor actor){   //通过参数实现向上转型。转型后可以实现重写方法
		System.out.println(name + ":ACTION!");
		actor.perform();
		System.out.println(name + ":END!");
	}
	
}
