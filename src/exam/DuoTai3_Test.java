package exam;


interface Utility{
	void use();
}

class Phone implements Utility{
		public void use(){
			System.out.println("Using Phone"); 
		}
		
		public void funtion1(){
			System.out.println("function1"); 
		}
};

public class DuoTai3_Test{
		public static void main(String[] args){
			Utility util = new Phone();      //用接口向上转型。
			util.use();                      //向上转型后，可以调用重写的方法
		//	util.funtion1();				 //错误！向上转型后，不能调用自己的方法。
		}
}
