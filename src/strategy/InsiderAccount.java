package strategy;
/**
 * 会员商品价格计算类
 *
 */
public class InsiderAccount extends Account {

	//会员商品价格计算方法
	public float getFactPrice(int amount,int price) {
		return amount*price*9/10;
	}
}
