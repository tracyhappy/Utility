package exam1;


import java.util.HashMap;

/**
 * 
 * 功能：将字符串中的字存入hashMap中的键中，键对应该字的个数
 */
public class CountByHashMap {
	
	
	public static void main(String[] args) {
		String str = "你好,我是你好,你,啦";
		//泛型<>里必须为对象，不能为基本类型
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hashMap.get(c) == null) {
				//如果不存在
				hashMap.put(c, 1);
			}else{
				//如果改字已经存在了
				int count = hashMap.get(c);
				hashMap.put(c, count+1);
			}
		}
		System.out.println("\"每个字\"对应的个数：");
		System.out.println(hashMap);
		System.out.println("键集合：");
		System.out.println(hashMap.keySet());
		System.out.println("值集合：");
		System.out.println(hashMap.values());
	}

}
