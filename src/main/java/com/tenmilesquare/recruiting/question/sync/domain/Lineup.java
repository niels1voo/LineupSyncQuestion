package com.tenmilesquare.recruiting.question.sync.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * A musical lineup containing a list of people.
 */
public class Lineup extends AbstractVersionedEntity{

    private String name;
    List<Person> people = new ArrayList<Person>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
