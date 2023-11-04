package com.edu.grooming.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Address;
import com.edu.grooming.error.NotFoundException;
import com.edu.grooming.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping("/addAddress") //http://localhost:8990/addAddress
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}

	@GetMapping("/getAllAddress") //http://localhost:8990/getAllAddress
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	@DeleteMapping("/deleteAddressById/{addressid}") //  http://localhost:8990/deleteAddressById/{addressid}
	public List<Address> deleteAddressById(@PathVariable("addressid") Integer addressid) throws NotFoundException{
		return addressService.deleteAddressById(addressid);
	}
	
	@GetMapping("/getAddressById/{addressid}") //  http://localhost:8990/getAddressById/{addressid}
	public Address getAddressById(@PathVariable("addressid") Integer addressid ) throws NotFoundException {
		return addressService.getAddressById(addressid);
	}
	
	@PutMapping("/updateAddressById/{addressid}") // http://localhost:8990/updateAddressById/{addressid}
	public Address updateAddressById(@PathVariable("addressid")Integer addressid,@Valid @RequestBody Address address) throws NotFoundException {
		return addressService.updateAddressById(addressid,address);
	}

}
