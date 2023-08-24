package in.brytcode.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.brytcode.jpademo.entity.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
}
