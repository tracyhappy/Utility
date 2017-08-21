package strategy;
/**
 * VIP商品价格计算类
 *
 */
public class VipAccount extends Account {
	
	//VIP商品价格计算方法
	public float getFactPrice(int amount,int price) {
		return amount*price*8/10;
	}
}
