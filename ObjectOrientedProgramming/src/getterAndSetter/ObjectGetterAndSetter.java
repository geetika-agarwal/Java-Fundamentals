package getterAndSetter;

import java.util.ArrayList;
import java.util.List;

class UserCollection {
	private String something;
	private List<String> user;

	public List<String> getUser() {
		return user;
	}

	public void setUser(List<String> user) {
		this.user = user;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}
}

public class ObjectGetterAndSetter {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Geetika");
		names.add("Ravi");
		names.add("Santosh");
		names.add("John");

		UserCollection obj = new UserCollection();
		obj.setUser(names);

		for (String name : obj.getUser()) {
			System.out.println(name);
		}
	}
}
