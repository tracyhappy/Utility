package duotai.duotai2;
/**
 * 
 * 功能：演员类 - （父类）
 * 作者：张学恺
 */
public class Actor {
	private String name;
	
	public Actor() {}
	
	public Actor(String name) {
		this.name = name;
	}
	
	/**
	 * 表演方法
	 */
	public void perform(){
		System.out.println("演员" + name + "正在表演");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
