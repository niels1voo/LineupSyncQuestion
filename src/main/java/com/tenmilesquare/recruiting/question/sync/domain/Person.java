package com.tenmilesquare.recruiting.question.sync.domain;

/**
 * A person
 *
 */
public class Person extends AbstractVersionedEntity{

    private String firstName;
    private String lastName;

    /** External person id, can be null */
    private String personIdentifier;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonIdentifier() {
        return personIdentifier;
    }

    public void setPersonIdentifier(String personIdentifier) {
        this.personIdentifier = personIdentifier;
    }
}
