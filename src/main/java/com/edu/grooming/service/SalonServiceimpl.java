package com.edu.grooming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.grooming.dao.Salon;
import com.edu.grooming.error.NotFoundException;
import com.edu.grooming.repository.SalonRepository;
import com.edu.grooming.repository.ServiceRepository;

@Service
public class SalonServiceimpl implements SalonService {

	@Autowired
	private SalonRepository salonRepository;

	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public Salon saveSalon(Salon salon) {
		// TODO Auto-generated method stub
		return salonRepository.save(salon);
	}

	@Override
	public List<Salon> getSalon() {
		// TODO Auto-generated method stub
		return salonRepository.findAll();
	}

	@Override
	public Salon getSalonByName(String salonname) {

		Salon salon = salonRepository.findbySalonname(salonname);

		return salon;
	}

	@Override
	public String deleteSalonByid(Integer salonid) throws NotFoundException {
		Optional<Salon> salon1 = salonRepository.findById(salonid);
		if (salon1.isPresent()) {
			salonRepository.deleteById(salonid);
		} else {
			throw new NotFoundException("Salon is not found");
		}

		return "Salon is deleted";
	}

	@Override
	public Salon updateSalonById(Integer salonid, Salon salon) throws NotFoundException {

		Salon salon2 = null;

		Optional<Salon> salon1 = salonRepository.findById(salonid);

		if (!salon1.isPresent()) {
			throw new NotFoundException("Salon does not exist");
		} else {
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

	@Override
	public Salon saveServiceBySalonId(@Valid com.edu.grooming.dao.Service service, Integer salonid)
			throws NotFoundException {
		// TODO Auto-generated method stub
		Optional<Salon> salon = salonRepository.findById(salonid);

		if (!salon.isPresent()) {
			throw new NotFoundException("Saloon is not Present");
		} else {
			Salon salon1 = salonRepository.findById(salonid).get();
			List<com.edu.grooming.dao.Service> services = salon1.getService();
			if (services.isEmpty()) {
				List<com.edu.grooming.dao.Service> services2 = new ArrayList<>();
				services2.add(serviceRepository.save(service));
				int id = service.getServiceid();
				com.edu.grooming.dao.Service service3 = serviceRepository.findById(id).get();
				Salon salon2 = salonRepository.findById(salonid).get();
				service3.serviceAssignSalon(salon2);
			}
		}
		return null;
	}
}
