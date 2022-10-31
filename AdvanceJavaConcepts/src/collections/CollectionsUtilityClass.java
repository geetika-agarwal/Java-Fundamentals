package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person
// implements Comparable<Person>
{
	private int personId;
	private String personName;
	private int age;

	public Person(int personId, String personName, int age) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Person p1) {
//		return this.getPersonId() - p1.getPersonId();
//	}

	public static Comparator<Person> idComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getPersonId() - p2.getPersonId();
		}
	};

	public static Comparator<Person> nameComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getPersonName().compareTo(p2.getPersonName());
		}
	};

	public static Comparator<Person> ageComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			int compare = p1.getAge() - p2.getAge();
			if (compare == 0)
				return Person.idComparator.compare(p1, p2);
			else
				return compare;
		}
	};
}

public class CollectionsUtilityClass {
	public static void main(String[] args) {
//		List<String> names = new ArrayList<String>();
//		names.add("King Kochar");
//		names.add("John Smith");
//		names.add("King Kochar");
//		names.add("Roger Lee");
//		names.add("Shreya Sharma");
//
//		// Print out the original list
//		System.out.println("The Original List: " + names);
//
//		// Reverse the elements of the list:
//		Collections.reverse(names);
//		System.out.println("The Reversed List: " + names);
//
//		// Shuffle the elements of the list:
//		Collections.shuffle(names);
//		System.out.println("The Shuffles List: " + names);
//
//		// Find the frequency of the particular element in the list:
//		System.out.println("The frequency of the element in the list is: " + Collections.frequency(names, "King Kochar"));

		List<Person> persons = new ArrayList<Person>();

		Person person1 = new Person();
		person1.setPersonId(100);
		person1.setPersonName("Ishika");
		person1.setAge(23);

		Person person2 = new Person();
		person2.setPersonId(200);
		person2.setPersonName("Geetika");
		person2.setAge(23);

		Person person3 = new Person();
		person3.setPersonId(300);
		person3.setPersonName("Ravi");
		person3.setAge(22);

		persons.add(person1);
		persons.add(person3);
		persons.add(person2);

//		Collections.sort(persons, Comparator.comparing(Person::getPersonId));
//		System.out.println(persons);

		System.out.println("Comparing using the Person ID: ");
		Collections.sort(persons, Person.idComparator);
		System.out.println(persons);

		System.out.println("Comparing using the Person Name: ");
		Collections.sort(persons, Person.nameComparator);
		System.out.println(persons);

		System.out.println("Comparing using Person Age: ");
		Collections.sort(persons, Person.ageComparator);
		System.out.println(persons);

	}
}
