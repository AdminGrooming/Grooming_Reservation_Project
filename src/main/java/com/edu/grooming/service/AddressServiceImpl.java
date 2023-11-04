package com.edu.grooming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Address;
import com.edu.grooming.error.NotFoundException;
import com.edu.grooming.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public List<Address> deleteAddressById(Integer addressid) throws NotFoundException {
		Optional<Address> address1=addressRepository.findById(addressid);
		if(!address1.isPresent()) {
			throw new NotFoundException("Address Id"+addressid+"not found");
		}
		addressRepository.deleteById(addressid);
		return addressRepository.findAll();
	}

	@Override
	public Address getAddressById(Integer addressid) throws NotFoundException {
		Optional<Address> address1=addressRepository.findById(addressid);
		if(!address1.isPresent()) {
			throw new NotFoundException("Address Id"+addressid+"not found");
		}
		return addressRepository.findById(addressid).get() ;
	}

	@Override
	public Address updateAddressById(Integer addressid, Address address) throws NotFoundException {
		Optional<Address> address1=addressRepository.findById(addressid);
		if(!address1.isPresent()) {
			throw new NotFoundException("Address Id"+addressid+"not found");
		}else {
			Address address2 = addressRepository.findById(addressid).get();
			address2.setHouseno(address.getHouseno());
			address2.setStreet(address.getStreet());
			address2.setCity(address.getCity());
			address2.setZipcode(address.getZipcode());
			address2.setState(address.getState());
			address2.setCountry(address.getCountry());
			
			return addressRepository.save(address2);
			
		}
	
	}
	
}
