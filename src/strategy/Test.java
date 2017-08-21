package strategy;
/**
 * 测试类
 *
 */
public class Test {
	public static void main(String[] args) {
		String name = "CD唱片";
		int price = 50;
		int amount = 2;
		float sum = 0;
		//普通顾客
		Context cont = new Context(new CommonAccount());
		sum = cont.doAccount(amount, price);
		System.out.println("您是普通顾客没有折扣，商品名称："+name+" 数量："+amount+" 单价："+price+" 应付金额："+sum);
		//会员
		cont = new Context(new InsiderAccount());
		sum = cont.doAccount(amount, price);
		System.out.println("您是会员享受9折优惠，商品名称："+name+" 数量："+amount+" 单价："+price+" 应付金额："+sum);
		//VIP会员
		cont = new Context(new VipAccount());
		sum = cont.doAccount(amount, price);
		System.out.println("您是VIP会员享受8折优惠，商品名称："+name+" 数量："+amount+" 单价："+price+" 应付金额："+sum);
						
	}
}
