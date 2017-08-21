package exam;


interface  F{
	   int x = 0;
	}
class E{
   int x =1;
}

public class VaribleOverride2_Test extends E implements F {
	   public void pX(){
//	      System.out.println(x);				//ambigious,编译会报错。。因为不知道是哪个x
	   }
	   public static void main(String[] args) {
	      new VaribleOverride2_Test().pX();
	   }
	}