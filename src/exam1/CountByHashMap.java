package exam1;


import java.util.HashMap;

/**
 * 
 * ���ܣ����ַ����е��ִ���hashMap�еļ��У�����Ӧ���ֵĸ���
 */
public class CountByHashMap {
	
	
	public static void main(String[] args) {
		String str = "���,�������,��,��";
		//����<>�����Ϊ���󣬲���Ϊ��������
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hashMap.get(c) == null) {
				//���������
				hashMap.put(c, 1);
			}else{
				//��������Ѿ�������
				int count = hashMap.get(c);
				hashMap.put(c, count+1);
			}
		}
		System.out.println("\"ÿ����\"��Ӧ�ĸ�����");
		System.out.println(hashMap);
		System.out.println("�����ϣ�");
		System.out.println(hashMap.keySet());
		System.out.println("ֵ���ϣ�");
		System.out.println(hashMap.values());
	}

}
