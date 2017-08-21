package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Test{

	public static void main(String[] args) {
		Date current=new Date();
		System.out.println(current.toLocaleString());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年-MM月-dd日 hh:mm:ss");
		System.out.println(dateFormat.format(current));				//将Date格式化为String:
		//另外查看API看SimpleDateFormat的parse方法
		
		
		//如果要设置自己的时间则用GregorianCalendar,它的父类是抽象类Calendar
		GregorianCalendar calendar = new GregorianCalendar(1991,7,22);
		Date date = calendar.getTime();								//Date和GregorianCalendar之间的转化: 
		System.out.println(date.toLocaleString());
	}

}
