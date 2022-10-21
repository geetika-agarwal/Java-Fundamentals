package getterAndSetter;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

class Client {
	List<Person> list = new ArrayList<Person>();

	public void setPList(List<Person> list) {
		this.list = list;
	}

	public List<Person> getPList() {
		return this.list;
	}
}

public class ObjectEntityGetterSetter {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Geetika"));
		list.add(new Person("Ravi"));
		list.add(new Person("Santosh"));
		list.add(new Person("John"));

		Client cl = new Client();
		cl.setPList(list);
		for (Person person : cl.getPList()) {
			System.out.println(person);
		}
	}

}
