package in.brytcode.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.brytcode.jpademo.entity.Vehical;
@Repository
public interface VehicalRepository extends JpaRepository<Vehical, String> {

}
