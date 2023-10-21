package com.brytcode.orgengine.controller;

import com.brytcode.orgengine.model.Organisation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface OrgController {
    @PostMapping(path = "/org",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Organisation createOrganisation(Organisation organisation);
    @GetMapping("/org/{orgUname}")
    public Organisation getOrganisation(@PathVariable("orgUname")  String orgUname);
    @GetMapping("/orgtype/{orgType}/organisations")
    public List<Organisation> getOrganisationsByType(@PathVariable("orgType")  String orgType);
}
