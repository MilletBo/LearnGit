package cn.com.deppon.main;

import cn.com.deppon.entity.User;
import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(1);
		user.setName("MilletBo");
		user.setAddress("上海市青浦区");
		System.out.println(JSONObject.fromObject(user));
	}
}
