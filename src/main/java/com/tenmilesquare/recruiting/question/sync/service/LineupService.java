package com.tenmilesquare.recruiting.question.sync.service;

import com.tenmilesquare.recruiting.question.sync.domain.Person;

import java.util.List;

/**
 * Created by ry on 3/23/17.
 */
public interface LineupService {

    /**
     * Syncs a list of people for a given line up.
     * Assume all the people are valid and exist in the database.
     * Assume the lineup is an existing lineup in the database
     *
     * Note that changes to the database are versioned, so we cannot just delete all the people for a given lineup and
     * recreate the new lineup. This would cause people that are contained in the incoming and existing lists to be
     * versioned needlessly.
     *
     * @param lineupId The lineup id
     * @param people The people to sync
     */
    public void syncPerson(Long lineupId, List<Person> people);
}
