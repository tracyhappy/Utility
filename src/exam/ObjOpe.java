package exam;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ObjOpe {
	// 写入文件
	public static void write(Object o, String file) {
		try {
			ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file));
			w.writeObject(o);
			w.flush();
			w.close();
		} catch (Exception e) {
		}
	}

	// 读取文件
	public static Object Reader(String file) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					file));
			Object o = in.readObject();
			in.close();
			return o;
		} catch (Exception e) {
		}
		return null;
	}

	// 读写测试
	public static void main(String[] args) throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("0001", 1);
		map.put("0010", 2);
		System.out.println("保存前数据:");
		Object[] ks = map.keySet().toArray();
		for (int i = 0; i < ks.length; i++)
			System.out.println(ks[i] + "=" + map.get(ks[i]));

		String file = "my.code";
		System.out.println("保存数据到文件:" + file);
		ObjOpe.write(map, file);
		System.out.println("保存数据到文件完成.");
		System.out.println("从文件 " + file + " 读取数据:");
		Object o = ObjOpe.Reader(file);
		Map<String, Integer> m = (Map<String, Integer>) o;
		System.out.println("从文件读取到的数据:");
		Object[] ks2 = m.keySet().toArray();
		for (int i = 0; i < ks2.length; i++)
			System.out.println(ks2[i] + "=" + m.get(ks2[i]));
	}
}