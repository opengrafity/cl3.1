package com.brytcode.orgengine.repository;

import com.brytcode.orgengine.entity.OrganisationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationTypeRepository extends JpaRepository<OrganisationType, Integer> {
    OrganisationType findByOrgType(String orgType);
}
