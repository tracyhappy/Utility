package exam;

/**
 * 枚举:可以替代静态常量public static final
 * 枚举常量有几个参数,则必须有一个带几个参数的构造函数。
 * enum.name()  	 //返回此枚举常量的名字
 * enum.toString()   //返回此枚举常量的名字
 * enum.ordinal()    //返回枚举常量的序数
 * Enum.values()	 //可以遍历所有成员
 * Enum是一个抽象类（abstract class），所有枚举类型enum都直接继承自它，因此enum类不能再继承了。
 * 
 */
public enum EnumGender {
	//枚举写在最前面，否则编译出错
    //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值。
    MAN("0","男"), WOMEN("1","女");
    
    private final String code;
    
    private final String sex;

    //枚举常量就有几个参数,其带参构造函数就写几个参数，。
    EnumGender(String code,String sex) {
        this.code = code;
        this.sex = sex;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getSex() {
        return sex;
    }
    
    
    /**
     * 通过code获取对应的sex值
     * 
     */
    public static String getSexByCode(String code)
    {
       for (EnumGender e : values())
       {
          if (e.getCode() == code)
          {
             return e.getSex();
          }
       }
       return null;
    }
    
    /**
     * 通过code获得枚举常量
     * 
     */
    public static EnumGender getByCode(String code) {
        for (EnumGender genum : values()) {
            if (genum.getCode().equals(code)) {
                return genum;
            }
        }
        return null;
    }
    
    /**
     * 通过枚举名字name获得枚举常量
     * 
     */
    public static EnumGender nameOf(String name){
    	EnumGender genum = null;
		if (name != null){
			for (EnumGender type : EnumGender.values()) {
				if (type.name().equalsIgnoreCase(name))
					genum = type;
			}
		}
		return genum;
	}
    
}
