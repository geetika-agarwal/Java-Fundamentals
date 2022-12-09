package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@Autowired
	AddressService service;

	@GetMapping("/address")
	public Map<Integer, Address> showAddressOfAllStudents() {
		return service.showAddressOfAllStudents();
	}

	@PutMapping("/address/{id}")
	public void addAddressToStudent(@PathVariable Integer id, @RequestBody Address a) {
		service.addAddressToStudent(id, a);
	}

	@PutMapping("/address/update/{id}")
	public void updateAddress(@PathVariable Integer id, @RequestBody Address a) {
		service.updateAdress(id, a);
	}

	@DeleteMapping("/address")
	public void removeAddress(@RequestParam Integer id) {
		service.removeAddress(id);
	}

	@GetMapping("/address/{id}")
	public Address getAddressForStudentId(@PathVariable Integer id) {
		return service.getAddressForStudentId(id);
	}

}
