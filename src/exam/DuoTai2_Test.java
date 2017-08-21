package exam;

interface Iface {}
class FourWheeler implements Iface{};
class Car extends FourWheeler{};
class Bus extends FourWheeler{};

public class DuoTai2_Test{
	
		public static void main(String []args){
			Iface car = new Car();              //正确 ，接口实现向上转型
			FourWheeler bus = new Bus();        //正确 ，接口实现向上转型
		
		}
		
}
