package com.tenmilesquare.recruiting.question.sync.domain;

import java.util.Date;

/**
 * Created by ry on 3/23/17.
 */
public class AbstractVersionedEntity {

    /** The database id */
    private Long id;

    /** The version of the entity */
    private Long versionId;

    /**
     * The date this version took affect
     */
    private Date versionStartDate;
    /**
     * The date this version ended. For current version expect 9999-12-31
     */
    private Date versionEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Date getVersionStartDate() {
        return versionStartDate;
    }

    public void setVersionStartDate(Date versionStartDate) {
        this.versionStartDate = versionStartDate;
    }

    public Date getVersionEndDate() {
        return versionEndDate;
    }

    public void setVersionEndDate(Date versionEndDate) {
        this.versionEndDate = versionEndDate;
    }
}
