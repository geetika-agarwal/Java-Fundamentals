package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AddressService {

	private static Map<Integer, Address> studentAddress;

	static {
		studentAddress = new HashMap<Integer, Address>();
		studentAddress.put(1, new Address("100", "Gandhi Chaowk", "Hyderabad", "Telangana"));
		studentAddress.put(2, new Address("101", "Rajiv Marg", "Banglore", "Karnataka"));
		studentAddress.put(3, new Address("102", "Sanjeev Colony", "Mumbai", "Maharastra"));
	}

	public void addAddressToStudent(Integer id, Address a) {
		studentAddress.put(id, a);
	}

	public Map<Integer, Address> showAddressOfAllStudents() {
		return studentAddress;
	}

	public void updateAdress(Integer id, Address a) {
		studentAddress.replace(id, a);
	}

	public void removeAddress(Integer id) {
		studentAddress.remove(id);
	}

	public Address getAddressForStudentId(Integer id) {
		Address a = studentAddress.get(id);
		return a;
	}

}
