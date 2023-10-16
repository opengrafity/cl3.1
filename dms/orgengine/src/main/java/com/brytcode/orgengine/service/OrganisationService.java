package com.brytcode.orgengine.service;

import com.brytcode.orgengine.model.Organisation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganisationService {
    public Organisation createOrganisation(Organisation organisation);
    public Organisation getOrganisation(String orgUname);
    public List<Organisation> getOrganisationsByType(String orgType);
}
