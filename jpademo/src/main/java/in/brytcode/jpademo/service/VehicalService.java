package in.brytcode.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.jpademo.entity.Vehical;
import in.brytcode.jpademo.repository.VehicalRepository;
@Service
public class VehicalService {
	@Autowired
	private VehicalRepository vehicalRepo;
	public void save(Vehical vehical) {
		vehicalRepo.save(vehical);
	}
	public Vehical get(String regNo) {
		return vehicalRepo.findById(regNo).orElse(null);
	}
}
