package exam1;

import exam.Modifier;
//������      ��ǰ�� ͬһpackage ������ ����package 
//public     ��     ��          ��       �� 
//protected  ��     ��          ��       �� 
//friendly   ��     ��          ��       �� 
//private    ��     ��          ��       �� 


class ChildX extends Modifier{
	//���������������:��ͬ���������������public��protected���εĿ��Է���
	public void haha(){
		System.out.println(a);				
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		display1();
		display2();
//		display3();
//		display4();
	}
	
	void haha1(){
		
	}
}


public class DiffPackage{
	
	void test(){
		//�޼̳�,���������������:��ͬ��,��ͬ�������,��public���εĿ��Է���
		Modifier obj = new Modifier();
		System.out.println(obj.a);
		obj.display1();
	}

	void test2(){
		//�̳�
		ChildX child = new ChildX();
		System.out.println(child.a);
		child.display1();
		child.haha();
	}
}
