package cn.com.deppon.main;

import cn.com.deppon.entity.User;
import net.sf.json.JSONObject;

public class Test {

	private static User getByUser() {
		User user = new User();
		user.setId(1);
		user.setName("MilletBo");
		user.setAddress("上海市青浦区");
		return user;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(JSONObject.fromObject(getByUser()));
	}
}
