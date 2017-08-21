package duotai.duotai2;

public class Test {

	public static void main(String[] args) {
		Director 张艺谋 = new Director("张艺谋");			//第三方类
		Singer 宋祖英 = new Singer("宋祖英");
		Dancer 杨丽萍 = new Dancer("杨丽萍");
		
		张艺谋.action(宋祖英);
		张艺谋.action(杨丽萍);

	}

}
