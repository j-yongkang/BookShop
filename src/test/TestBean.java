package test;

import org.junit.Test;

import com.po.UserBean;

public class TestBean {
	@Test
	public void test(){
		UserBean user =new UserBean();
		user.setUid(1);
		user.setUsername("ÕÅÈı");
		user.setPassword("1001");
		user.setAge(20);
		String[] s={"ÀºÇò","ÇÃ´úÂë","Ë¯¾õ"};
		user.setHobby(s);

		
		System.out.println(user.getUid());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		for(int i=0;i<user.getHobby().length;i++)
		{
		System.out.println(user.getHobby()[i]);
		}
	}
}
