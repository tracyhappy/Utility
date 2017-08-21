package exam;

import java.util.Arrays;
import java.util.Comparator;


class StudentMan2{
	public int score;
	
	public StudentMan2(int score){
		this.score = score;
	}
	
	public String toString(){
		return score + "";
	}
}

/**
 *  Arrays.sort(array);					//比较的对象必须实现Comparable接口(重写compareTo方法,who greater who behind)
 *	Arrays.sort(array,comparator);
 *	String和包装类是实现了Comparable接口的,因此重写了compareTo方法
 */
public class Sort_Arrays2 {
	public static void main(String[] args) {
		StudentMan2 []stu = {new StudentMan2(8),new StudentMan2(6),new StudentMan2(7)};
		System.out.println("排序前：");
		for(StudentMan2 student:stu){
			System.out.print(student);
		}
		System.out.println("\n排序后：");
		Arrays.sort(stu,new Comparator<StudentMan2>(){

			//重写compare方法
			public int compare(StudentMan2 o1, StudentMan2 o2) {
				if (o1.score > o2.score){
					return 1;
				}else if (o1.score < o2.score){
					return -1;
				}else{
					return 0;
				}
			}
		});
		for(StudentMan2 student:stu){
			System.out.print(student);
		}
	}
}
