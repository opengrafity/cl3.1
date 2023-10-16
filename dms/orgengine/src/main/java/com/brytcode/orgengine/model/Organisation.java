package com.brytcode.orgengine.model;

import jakarta.persistence.*;

import java.util.Date;


public class Organisation {
    private int lineId;
    private String orgId;
    private String orgName;
    private String orgUname;
    private OrganisationType orgType;
    private String orgAddress;
    private String orgPhoneNo;
    private String orgEmailId;
    private Date createdDate;
    private Date lastUpdatedDate;
    private String upsertBy;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgUname() {
        return orgUname;
    }

    public void setOrgUname(String orgUname) {
        this.orgUname = orgUname;
    }

    public OrganisationType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrganisationType orgType) {
        this.orgType = orgType;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgPhoneNo() {
        return orgPhoneNo;
    }

    public void setOrgPhoneNo(String orgPhoneNo) {
        this.orgPhoneNo = orgPhoneNo;
    }

    public String getOrgEmailId() {
        return orgEmailId;
    }

    public void setOrgEmailId(String orgEmailId) {
        this.orgEmailId = orgEmailId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getUpsertBy() {
        return upsertBy;
    }

    public void setUpsertBy(String upsertBy) {
        this.upsertBy = upsertBy;
    }
}
