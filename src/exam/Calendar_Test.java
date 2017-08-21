package exam;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Test {

	public static void main(String[] args) {
		/*将当前日期时间表示为年，月，日，时，分，秒*/     //Calendar类为抽象类
		Calendar calendar = Calendar.getInstance();//获取日历对象
		int year = calendar.get(Calendar.YEAR);    
		int month = calendar.get(Calendar.MONTH)+1;  //计算机里存的月份要小些
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println("今天是："+ year + "年" + month + "月" + day + "日");
		System.out.println("现在是" + hour + ":" + minute + ":" + second);
		
		/*将当前时间的月份设置为9月*/
		calendar.set(Calendar.MONTH,8);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("今天是："+ year + "年" + month + "月" + day + "日");
		
		/*在当前时间上加10天*/
		calendar.add(Calendar.DAY_OF_MONTH,10);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("今天是："+ year + "年" + month + "月" + day + "日");
		
		/*判断今年是否为闰年*/
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		boolean flag = gregorianCalendar.isLeapYear(gregorianCalendar.get(gregorianCalendar.YEAR));
		System.out.println("今年是否为闰年？" + flag);
		
		System.out.println(String.format("金钱$%.2f", 123.324));
		
		

	}

}
