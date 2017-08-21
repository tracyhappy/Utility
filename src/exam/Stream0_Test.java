package exam;

import java.io.FileOutputStream;
import java.io.PrintWriter;

//运行后生成abc.txt,但该文件中可能无内容。因为没有关闭流
//字符流带有缓冲。关闭流，才会将缓冲区内容输出到文件。
public class Stream0_Test {

	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileOutputStream("d:/abc.txt"));
			String name = "chen";
			out.print(name);
		} catch (Exception e) {
			System.out.println("文件没有发现！");
		}
//		finally{
//			out.close();
//		}
	}

}
