package utils;

import com.po.UserBean;

public class TestThrow {
public static void main(String[] args) {
//	int x=10;
//	int y=2;
//	System.out.println("x/y="+x/y);

//	int a[]={11,22,33};
//	System.out.print(a[-1]);

//	String name=null;
//	System.out.println("aaa".equals(name));
	Object o=new Object();
	String s=(String)o;
	
	//int age =Integer.valueOf("ab");
	System.out.println("异常之后的代码");
}
}