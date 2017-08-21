package adapter;


interface Window{      //定义窗口接口，表示窗口操作
	public void open();    //打开
	public void close();    //关闭
	public void activated();    //窗口活动
	public void iconified();    //窗口最小化
	public void deiconified();    //窗口恢复大小
}

//适配器类（将方法全部实现，只是函数体为空，
//然后让子类有选择的去实现某些方法，不必全部都实现）
abstract class WindowAdapter implements Window{
	
	public void open(){};    //打开
	public void close(){};    //关闭
	public void activated(){};    //窗口活动
	public void iconified(){};    //窗口最小化
	public void deiconified(){};    //窗口恢复大小
};

class WindowImpl extends WindowAdapter{         //选择性的实现一些函数
	public void open(){
		System.out.println("窗口打开");
	}
	public void close(){
		System.out.println("窗口关闭");
	}
};
//此种代理设计模式经常在图形界面中用

public class test_adapter {
	public static void main(String []args){
		WindowAdapter win = new WindowImpl();
		win.open();
		win.close();
	}
};
