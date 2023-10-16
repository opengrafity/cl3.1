package com.brytcode.orgengine.repository;

import com.brytcode.orgengine.entity.Organisation;
import com.brytcode.orgengine.entity.OrganisationType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {
    public Organisation findByOrgUname(String orgUname);
    public List<Organisation> findAllByOrgType(OrganisationType orgType);
}
