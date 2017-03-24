package com.tenmilesquare.recruiting.question.sync.repository;

import com.tenmilesquare.recruiting.question.sync.domain.Person;

import java.util.List;

/**
 * Created by ry on 3/23/17.
 */
public interface LineupRepo {

    /**
     * Returns all the current people in the database for a given lineup
     * @param lineupId The database identifier for the line up
     * @return The current list of people of the lineup
     */
    public List<Person> getLineupPeople(Long lineupId);

    /**
     * Removes a specific person from a lineup
     * @param personId the database identifier of the person to remove
     * @param lineupId the lineup that will have the person removed.
     */
    public void removePersonFromLineup(Long personId, Long lineupId);

    /**
     * Adds a specific person from a lineup
     * @param personId the database identifier of the person to add
     * @param lineupId the lineup that will have the person add.
     */
    public void addPersonToLineup(Long personId, Long lineupId);
}
