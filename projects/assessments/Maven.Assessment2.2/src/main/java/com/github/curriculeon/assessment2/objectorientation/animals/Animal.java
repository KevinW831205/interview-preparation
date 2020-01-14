package com.github.curriculeon.assessment2.objectorientation.animals;

import com.github.curriculeon.assessment2.objectorientation.Address;
import com.github.curriculeon.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    public Animal() {
        this(null,new Person());
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    Long id;
    Person owner;

    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return this.owner.getAddress();
    }
}
