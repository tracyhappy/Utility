package duotai.duotai2;

/**
 * 
 * 功能：舞蹈家
 * 作者：张学恺
 */
public class Dancer extends Actor {
	public Dancer(){}
	
	public Dancer(String name){
		super(name);
	}
	
	/**
	 * 重写表演方法
	 */
	@Override
	public void perform() {
		System.out.println("Dancer" + this.getName() + "正在跳舞");
	}
}
