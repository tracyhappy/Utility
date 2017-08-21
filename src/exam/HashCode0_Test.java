package exam;

import java.util.HashSet;

//如果equals相等，hashCode相等，在Hash的数据结构中就会被当成同一个对象。
//1、hashCode的主要是用于提高查找效率，hashCode是用来在散列存储结构(如Hashtable，HashMap，Set等)中确定对象的存储地址的。
//散列存储结构快速查询数据过程： 直接通过对象的hashCode找到该对象的地址，就能获取到数据。而不用一个一个的进行比较，然后才返回。所以快！
//2、对于具有hash的数据结构。如果两个对象的hashCode和equals方法都相同，则在数据结构中识别为同一个对象（即add进set集合话，只有一个对象）。
//如果两个对象的hashCode不同，但是equals相同的话，则存放在不同的篮子里，识别为不同的对象（即add进set集合话，有两个对象）。
//如果两个对象的equals不同，但是hashCode相同的话,则存放在相同的篮子里，但是篮子里仍有两个对象，识别为不同的对象（即add进set集合话，有两个对象）。
//所以一定要保证重写equals方法的时候，就要重写hashCode方法。当且仅当两个都相等时，才能保证识别为一个对象。
//3、两个对象的hashCode相同，equals不一定相等，只能够说明这两个对象在散列存储结构中，他们“存放在同一个篮子里”。
//4、两个对象的equals相同，hashCode不一定相同，只能说明在散列存储结构中，存储在不同的篮子里的。
//5、综上，散列存储结构中都有add，contains方法。都是先根据hashCode和equals来确定集合中是否已经含有对象的。
//6、HashSet是基于HashMap实现的,内部就是一个HashMap,key为我们要存的值，value都为new Object()

class Person2{
	private int age;
	   
	   private String name;
	   
	   public Person2(int age, String name)
	   {
	      super();
	      this.age = age;
	      this.name = name;
	   }

	   public String toString()
	   {
	      return "Person [age=" + age + ", name=" + name + "]";
	   }

	   public int hashCode()
	   {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + age;
	      result = prime * result + ((name == null) ? 0 : name.hashCode());
	      return result;
	   }

//	   public boolean equals(Object obj)
//	   {
//	      if (this == obj)
//	         return true;
//	      if (obj == null)
//	         return false;
//	      if (getClass() != obj.getClass())
//	         return false;
//	      Person2 other = (Person2)obj;
//	      if (age != other.age)
//	         return false;
//	      if (name == null)
//	      {
//	         if (other.name != null)
//	            return false;
//	      }
//	      else if (!name.equals(other.name))
//	         return false;
//	      return true;
//	   }
	   
}

public class HashCode0_Test {
	@org.junit.Test
    public void TestHash(){
		Person2 obj1 = new Person2(25, "zxk");
	    Person2 obj2 = new Person2(25, "zxk");
	    
	    HashSet<Person2> set = new HashSet<Person2>();
	    set.add(obj1);
	    
	    System.out.println(obj1.hashCode() == obj2.hashCode());
	    System.out.println(set.contains(obj2));
	    if(!set.contains(obj2)){
	    	set.add(obj2);
	    }
	    System.out.println(set);
	}
}
