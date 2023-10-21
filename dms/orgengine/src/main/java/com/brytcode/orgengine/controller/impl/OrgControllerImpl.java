package com.brytcode.orgengine.controller.impl;

import com.brytcode.orgengine.controller.OrgController;
import com.brytcode.orgengine.model.Organisation;
import com.brytcode.orgengine.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrgControllerImpl implements OrgController {
    @Autowired
    private OrganisationService orgService;
    @Override
    public Organisation createOrganisation(@RequestBody Organisation organisation) {
        return orgService.createOrganisation(organisation);
    }

    @Override
    public Organisation getOrganisation(String orgUname) {
        return orgService.getOrganisation(orgUname);
    }

    @Override
    public List<Organisation> getOrganisationsByType(String orgType) {
        return orgService.getOrganisationsByType(orgType);
    }
    @GetMapping("/org/info")
    public String get(){
        return "Good";
    }
}
