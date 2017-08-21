package exam;

public class EnumTest {
    
    @org.junit.Test
    public void colorEnum(){
        //枚举是一种类型，用于定义变量，以限制变量的赋值；赋值时通过“枚举名.值”取得枚举中的值
        EnumColor enumColor = EnumColor.blue;
        switch (enumColor) {
            case red:
                System.out.println("color is red");
                break;
            case green:
                System.out.println("color is green");
                break;
            case yellow:
                System.out.println("color is yellow");
                break;
            case blue:
                System.out.println("color is blue");
                break;
        }
        
        //遍历枚举
        System.out.println("遍历EnumColor枚举中的值");
        for(EnumColor color : EnumColor.values()){
            System.out.println(color);
        }
        
        //获取枚举的个数
        System.out.println("EnumColor枚举中的值有:"+EnumColor.values().length+"个");
        
        //获取枚举的索引位置，默认从0开始
        System.out.println("索引位置："+EnumColor.red.ordinal());//0
        System.out.println("索引位置："+EnumColor.green.ordinal());//1
        System.out.println("索引位置："+EnumColor.yellow.ordinal());//2
        System.out.println("索引位置："+EnumColor.blue.ordinal());//3
        
        //枚举默认实现了java.lang.Comparable接口。比较两个枚举实例的oridinal
        System.out.println("类型比较："+EnumColor.blue.compareTo(EnumColor.green));//2
    }
    
    
    @org.junit.Test
    public void genderEnum(){
        for(EnumGender gender : EnumGender.values()){
            System.out.println("迭代得到的code值："+gender.getCode());
            System.out.println("迭代得到的name值："+gender.getSex());
        }
        
        if(EnumGender.MAN.getCode().equals("0")){
            System.out.println("true");
            System.out.println(EnumGender.getSexByCode("0"));
            System.out.println(EnumGender.getByCode("0").getSex());
        }
        
        System.out.println(EnumGender.nameOf("man"));
    }
    
    @org.junit.Test
    public void orderStateEnum(){
        for(EnumOrderState order : EnumOrderState.values()){
        	System.out.println(order.getName());
            System.out.println(order.getValue());
        }
    }
    
}
