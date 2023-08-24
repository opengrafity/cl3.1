package in.brytcode.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.brytcode.jpademo.entity.ODC;
@Repository
public interface ODCRepository extends JpaRepository<ODC, Integer>{

}
