package exam;

import java.util.Arrays;

/**
 *  Arrays.sort(array);					//比较的对象必须实现Comparable接口(重写compareTo方法,who greater who behind)
 *	Arrays.sort(array,comparator);
 *	String和包装类是实现了Comparable接口的,因此重写了compareTo方法
 */
class StudentMan implements Comparable<StudentMan> {
	private int score;
	public StudentMan(int score){
		this.score = score;
	}
	
	//重写compareTo方法
	public int compareTo(StudentMan other){
		if (this.score > other.score){
			return 1;
		}else if (this.score < other.score){
			return -1;
		}else{
			return 0;
		}
	}
	
	public String toString(){
		return score + "";
	}
}

public class Sort_Arrays1 {
	public static void main(String[] args) {
		StudentMan []stu = {new StudentMan(8),new StudentMan(6),new StudentMan(7)};
		System.out.println("排序前：");
		for(StudentMan student:stu){
			System.out.print(student);
		}
		System.out.println("\n排序后：");
		Arrays.sort(stu);
		for(StudentMan student:stu){
			System.out.print(student);
		}
	}
}
