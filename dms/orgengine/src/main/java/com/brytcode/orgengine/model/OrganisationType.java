package com.brytcode.orgengine.model;

import jakarta.persistence.*;

import java.util.Date;

public class OrganisationType {
    private int lineId;
    private String orgType;
    private String orgTypeDesc;
    private Date createdDate;
    private Date lastUpdatedDate;
    private String upsertBy;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgTypeDesc() {
        return orgTypeDesc;
    }

    public void setOrgTypeDesc(String orgTypeDesc) {
        this.orgTypeDesc = orgTypeDesc;
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
