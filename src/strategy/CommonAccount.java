package strategy;
/**
 * 普通顾客商品价格计算类
 *
 */
public class CommonAccount extends Account {
	
	//普通顾客商品价格计算方法
	public float getFactPrice(int amount,int price) {
		return amount*price;
	}
}
