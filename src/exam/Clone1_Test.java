package exam;

//Cloneable为标识接口，无方法，仅表示一种能力
//注意浅拷贝与深拷贝的区别。浅拷贝中的引用属性会指向同一块地址,深拷贝中的引用属性会指向不同地址。
//如果只是用Object中默认的clone方法,是浅拷贝。
//如果要做到深层次的深拷贝,必须每一个类的引用属性都单独clone一下。

class Body implements Cloneable{
	private Head head;
	
	public Body(Head head) {
		super();
		this.head = head;
	}
	
	//重写的clone方法是Object的
	public Object clone() throws CloneNotSupportedException {
		Body cloned = (Body)super.clone();
		cloned.head = (Head) head.clone();						//实现深拷贝
		return cloned;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}
}

class Head implements Cloneable{
	private Face face;
	
	public Head(Face face) {
		this.face = face;
	}

	//重写的clone方法是Object的
	public Object clone() throws CloneNotSupportedException {
		Head cloned = (Head)super.clone();
		cloned.face = (Face)face.clone();						//实现深拷贝
		return cloned;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}
}

class Face implements Cloneable{
	//重写的clone方法是Object的
	public Object clone() throws CloneNotSupportedException {
		Face cloned = (Face)super.clone();
		return cloned;
	}
}

public class Clone1_Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Body body = new Body(new Head(new Face()));
		Body cloned =(Body)body.clone();
		String result = body.getHead().getFace() == cloned.getHead().getFace()?"浅拷贝":"深拷贝";
		System.out.println(body == cloned);											//false
		System.out.println(body.getHead() == cloned.getHead());						//如果是true,同一地址,浅拷贝;如果是false,不同地址,深拷贝
		System.out.println(body.getHead().getFace() == cloned.getHead().getFace()); //如果是true,同一地址,浅拷贝;如果是false,不同地址,深拷贝
		System.out.println(result);
		
	}
}
