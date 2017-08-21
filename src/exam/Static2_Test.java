package exam;
public class Static2_Test{
   public int count(){
     return 1%9;
   }
   public static void main(String[]args){
//     System.out.println(count());      //编译错误。。静态方法不能调用非静态方法
   }
}
