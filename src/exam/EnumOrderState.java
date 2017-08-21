package exam;

/**
 * 实现带有抽象方法的枚举
 */
public enum EnumOrderState {
	/** 已取消 */
    CANCEL {public String getValue(){return "已取消";}},
    /** 待审核 */
    WAITCONFIRM {public String getValue(){return "待审核";}},
    /** 等待付款 */
    WAITPAYMENT {public String getValue(){return "等待付款";}},
    /** 正在配货 */
    ADMEASUREPRODUCT {public String getValue(){return "正在配货";}},
    /** 等待发货 */
    WAITDELIVER {public String getValue(){return "等待发货";}},
    /** 已发货 */
    DELIVERED {public String getValue(){return "已发货";}},
    /** 已收货 */
    RECEIVED {public String getValue(){return "已收货";}};
    
    /**
     *  抽象方法，则每个枚举实例都必须实现此方法
     */
    public abstract String getValue();
    
    /**
     * 类方法，则每个枚举实例都会有此方法。
     */
    public String getName(){
    	return this.name();
    }
    
    
}
