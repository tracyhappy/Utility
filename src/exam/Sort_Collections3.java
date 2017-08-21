package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task implements Comparable<Task>{
	   
	   private String name;
	   
	   private int priority;

	   public Task(String name, int priority)
	   {
	      this.name = name;
	      this.priority = priority;
	   }

	   public String getName()
	   {
	      return name;
	   }

	   public void setName(String name)
	   {
	      this.name = name;
	   }

	   public int getPriority()
	   {
	      return priority;
	   }

	   public void setPriority(int priority)
	   {
	      this.priority = priority;
	   }

	   public int hashCode()
	   {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((name == null) ? 0 : name.hashCode());
	      result = prime * result + priority;
	      return result;
	   }

	   public boolean equals(Object obj)
	   {
	      if (this == obj)
	         return true;
	      if (obj == null)
	         return false;
	      if (getClass() != obj.getClass())
	         return false;
	      Task other = (Task)obj;
	      if (name == null)
	      {
	         if (other.name != null)
	            return false;
	      }
	      else if (!name.equals(other.name))
	         return false;
	      if (priority != other.priority)
	         return false;
	      return true;
	   }

	   public String toString()
	   {
	      return "Task (name=" + name + ", priority=" + priority + ")";
	   }

	   public int compareTo(Task o)
	   {
	      return this.priority - o.getPriority();              //who greater who behind
	   }
	}


class TaskCompare implements Comparator<Task>{

   public int compare(Task o1, Task o2)
   {
      return o1.getPriority() - o2.getPriority();              //who greater who behind
   }
   
}

/**
 * Collections.sort(list);					//比较的对象必须实现Comparable接口(重写compareTo方法,who greater who behind)
 * Collections.sort(list,comparator);
 * 其实这两个方法内部都调用的是Arrays.sort
 * String和包装类是实现了Comparable接口的,因此重写了compareTo方法
 * 应用场景： 按优先级或者名字的字母进行排序
 */
public class Sort_Collections3
{
   public static void main(String[] args)
   {
      Task task1 = new Task("fix TR",5);
      Task task2 = new Task("AT",2);
      List<Task> list = new ArrayList<Task>();
      list.add(task1);
      list.add(task2);
      System.out.println(task1.compareTo(task2));
      System.out.println(list);
      
      //方式一：
      Collections.sort(list);

      
      //方式二(a)：
//	  Comparator<Task> taskCompare1 = new TaskCompare();
//	  Collections.sort(list,taskCompare1);
      
      //方式二(b)：
//      Comparator<Task> taskCompare2 = new Comparator<Task>()
//      {
//         public int compare(Task o1, Task o2)
//         {
//            return o1.getPriority() - o2.getPriority();
//         }
//      };
//      Collections.sort(list, taskCompare2);
      
      //方式二(c)：
//      Collections.sort(list, new Comparator<Task>()
//      {
//         public int compare(Task o1, Task o2)
//         {
//            return o1.getPriority() - o2.getPriority();
//         }
//      });
    
      System.out.println(list);
      
      System.out.println("---------------------------------------------");

      //PackClass and String both implements Comparable (compareTo)
      Integer integer1 = new Integer(10);
      Integer integer2 = new Integer(5);
      List<Integer> intList = new ArrayList<Integer>();
      intList.add(integer1);
      intList.add(integer2);
      
      System.out.println(integer1.compareTo(integer2));                    // -1,0,1
      Collections.sort(intList);
      System.out.println(intList);
      
      String str1 = "ABC";
      String str2 = "abc";
      List<String> strList = new ArrayList<String>();
      strList.add(str1);
      strList.add(str2);
      System.out.println(str1.compareTo(str2));
      System.out.println(str1.compareToIgnoreCase(str2));
      Collections.sort(strList);
      System.out.println(strList);

      //new interface      
      new OwnInterface()
      {
         public void hello()
         {
            System.out.println("new interface了");
         }
      };
   }
}


interface OwnInterface{
   public void hello();
}