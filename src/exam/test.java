package exam;

public class test {
	int x=10;
	public static void main(String[] args) {
		int a;
		for (int i = 0; i < 6; i++) {
//			a++;					 //编译出错。。因为没赋值
		}
		
		boolean flag = false;
		if (flag = true) {
			//执行这一句
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		System.out.println(11|2);
		
		String s= "ABCD";
		s.concat("E");
		s.replace('C','F');
		System.out.println(s);
		
		System.out.println(count(3));
		System.out.println(count(4));
	}
	 
	 //count(n) = 1！+ 2！ + ... + n！
	 public static int count(int n){
		int result = 0;
		for(int i=1;i<=n;i++){
			int a = 1;
			for(int j=1;j<=i;j++){
				a=a*j;
			}
			result+=a;
		}
		return result;
	}

}
