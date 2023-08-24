package in.brytcode.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.jpademo.entity.ODC;
import in.brytcode.jpademo.repository.ODCRepository;
@Service
public class ODCService {
	@Autowired
	private ODCRepository odcRepository;
	public void saveODC(ODC odc){
		odcRepository.save(odc);
	}
}
