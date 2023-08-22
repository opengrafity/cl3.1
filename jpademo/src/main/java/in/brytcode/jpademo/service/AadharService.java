package in.brytcode.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.jpademo.entity.Aadhar;
import in.brytcode.jpademo.repository.AadharRepository;

@Service
public class AadharService {
	@Autowired
	AadharRepository aadharRepo;
	public void save(Aadhar aadhar) {
		aadharRepo.save(aadhar);
	}
	public Aadhar get(String aadharId) {
		return aadharRepo.findById(aadharId).orElse(null);
	}
}
