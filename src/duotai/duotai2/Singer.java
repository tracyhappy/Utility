package duotai.duotai2;

/**
 * 
 * 功能：歌唱家
 * 作者：张学恺
 */
public class Singer extends Actor {
	public Singer(){}
	
	public Singer(String name){
		super(name);
	}
	
	/**
	 * 重写表演方法
	 */
	@Override
	public void perform() {
		System.out.println("Singer" + this.getName() + "正在唱歌");
	}
	
	
}
