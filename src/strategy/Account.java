package strategy;
/**
 * 计算商品价格的抽象类
 *
 */
public abstract class Account {
	
	public abstract float getFactPrice(int amount,int price);//获取实际的商品销售价格
	
}
