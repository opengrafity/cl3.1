package in.brytcode.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.brytcode.jpademo.entity.Aadhar;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar, String>{

}
