package com.edu.grooming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.grooming.dao.Salon;
import com.edu.grooming.error.NotFoundException;
import com.edu.grooming.repository.SalonRepository;

@Service
public class SalonServiceimpl implements SalonService {
	
	@Autowired
	private SalonRepository salonRepository;
	
	

	@Override
	public Salon saveSalon(Salon salon) {
		// TODO Auto-generated method stub
		return  salonRepository.save(salon);
	}

	@Override
	public List<Salon> getSalon() {
		// TODO Auto-generated method stub
		return salonRepository.findAll();
	}

	@Override
	public Salon getSalonByName(String salonname) {
		
		Salon salon =salonRepository.findbySalonname(salonname);
		
		return salon;
	}

	@Override
	public String deleteSalonByid(Integer salonid) throws NotFoundException {
		Optional<Salon> salon1 = salonRepository.findById(salonid);
		if(salon1.isPresent()) {
			salonRepository.deleteById(salonid);
		}else {
			throw new NotFoundException("Salon is not found");
		}
		
		return "Salon is deleted";
	}

	@Override
	public Salon updateSalonById(Integer salonid,Salon salon) throws NotFoundException {
		
		Salon salon2 = null;
		
		Optional<Salon> salon1 = salonRepository.findById(salonid);
		
		if(!salon1.isPresent()) {
			throw new NotFoundException("Salon does not exist");
		}else {
			salon2 = salonRepository.findById(salonid).get();
			
			salon2.setSalonaddress(salon.getSalonaddress());
			
			salon2.setSaloncity(salon.getSaloncity());
			
			salon2.setSalondescription(salon.getSalondescription());
			
			salon2.setSalonemailid(salon.getSalonemailid());
			
			salon2.setSalonname(salon.getSalonname());
			
			salon2.setSalonopeninghours(salon.getSalonopeninghours());
			
			salon2.setSalonpassword(salon.getSalonpassword());
			
			salon2.setSalonphone(salon.getSalonphone());
			
			salon2.setSalonpincode(salon.getSalonpincode());
			
			salon2.setSalonrating(salon.getSalonrating());
			
			salon2.setSalonstate(salon.getSalonstate());		
			
		}
		
		return salonRepository.save(salon2);
	}

	
}
