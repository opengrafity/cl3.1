package com.brytcode.orgengine.service.impl;

import com.brytcode.orgengine.entity.OrganisationType;
import com.brytcode.orgengine.model.Organisation;
import com.brytcode.orgengine.repository.OrganisationRepository;
import com.brytcode.orgengine.repository.OrganisationTypeRepository;
import com.brytcode.orgengine.service.OrganisationService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrganisationServiceImpl implements OrganisationService {
    @Autowired
    private OrganisationRepository orgRepo;
    @Autowired
    private OrganisationTypeRepository orgTypeRepo;
    @Override
    public Organisation createOrganisation(Organisation orgModel) {
        com.brytcode.orgengine.entity.Organisation orgEntity = new com.brytcode.orgengine.entity.Organisation();
        BeanUtils.copyProperties(orgModel,orgEntity);
        com.brytcode.orgengine.entity.OrganisationType orgType = new com.brytcode.orgengine.entity.OrganisationType();
        BeanUtils.copyProperties(orgModel.getOrgType(),orgType);
        orgEntity.setOrgType(orgType);
        orgEntity = orgRepo.save(orgEntity);
        BeanUtils.copyProperties(orgEntity,orgModel);
        return orgModel;
    }

    @Override
    public Organisation getOrganisation(String orgUname) {
        com.brytcode.orgengine.entity.Organisation orgEntity = orgRepo.findByOrgUname(orgUname);
        Organisation orgModel = new Organisation();
        BeanUtils.copyProperties(orgEntity,orgModel);
        return orgModel;
    }

    @Override
    public List<Organisation> getOrganisationsByType(String orgType) {
        OrganisationType orgTypeEntity = orgTypeRepo.findByOrgType(orgType);
        List<com.brytcode.orgengine.entity.Organisation> orgEntities = orgRepo.findAllByOrgType(orgTypeEntity);
        List<Organisation> orgModels = orgEntities.stream().map(orgEntity->{
            Organisation orgModel = new Organisation();
            BeanUtils.copyProperties(orgEntity,orgModel);
            return orgModel;
        }).collect(Collectors.toList());

        return orgModels;
    }
}
