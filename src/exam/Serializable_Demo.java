package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *  在序列化时，如果一个可序列化类有多个父类（包括直接和间接父类），则该类的所有父类要么是可序列化的，要么有无参数的构造方法，否则在反序列化时抛出异常
 *	在序列化时，对象的类名、属性都会被序列化，而方法、static属性、transient属性不会被序列化
 *
 */


class User implements Serializable{
	private int no;
	private String name;
	//对于transient字段序列化机制会跳过不会将其写入文件，当然也不可被恢复。
	private transient String addrress; //定义transient可以实现保护信息安全

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrress() {
		return addrress;
	}

	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}

	public String toString() {
		return this.no + this.name + this.addrress;
	}
}

	
public class Serializable_Demo {
	/**
     *将对象序列化到磁盘文件中
     *@param obj	对象
     *@param path   路径
     */
	public static void writeObject(Object obj,String path){
		File file = new File(path);
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream ObjectOutputStream = null;
		if(file.exists()){
			file.delete();
	    }
		try {
			fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream = new ObjectOutputStream(fileOutputStream);
			ObjectOutputStream.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fileOutputStream.close();
				ObjectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
     *反序列化,将磁盘文件转化为对象
     *@param path   路径
     *@return   返回对象
     */
	public static Object readObject(String path){
		File file = new File(path);
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			return objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fileInputStream.close();
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		 /*****************将对象序列化***************/
		User user = new User();
		user.setNo(3);
		user.setName("jbx");
		user.setAddrress("aa");
		new Serializable_Demo().writeObject(user, "user.txt");
		
		 /*****************将对象序反列化***************/
		Object obj = new Serializable_Demo().readObject("user.txt");
		if (obj instanceof User) {
			User user1 = (User)obj;
			System.out.println(user1.getNo());
			System.out.println(user1.getName());
			//对于transient字段序列化机制会跳过不会将其写入文件，当然也不可被恢复。
			System.out.println(user1.getAddrress()); //受保护所以为null。定义transient可以实现保护信息安全
		}
		
		//同样序列化时。User里面可以有集合
	}
}

