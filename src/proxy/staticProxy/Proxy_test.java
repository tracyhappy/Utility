package proxy.staticProxy;


interface NetWork{
	void browse();                //浏览方法
};

class Real implements NetWork{                         //真实服务器
	@Override
	public void browse() {
		System.out.println("上网浏览信息");
	}
}

class Proxy implements NetWork{                       //代理服务器
	private NetWork network;                //代理对象。
	
	public Proxy(NetWork network) {
		this.network = network;
	}

	public void check(){
		System.out.println("检查是否合法");
	}
	
	@Override
	public void browse() {                   //代理操作
		this.check();                        //先检查
		network.browse();                    //调用真实的主题操作
	}
	
}

/*代理设计:一个操作的接口有两个子类，其中一个是真实主题的实现类，另外一个是代理类，
  代理实现类要完成比真实主题实现类更多的内容，而且本身还要处理一些与具体业务有关的代码
 **/
public class Proxy_test {

	public static void main(String[] args) {
		NetWork proxy = new Proxy(new Real()); //代理真实的操作
		proxy.browse();
	}

}
