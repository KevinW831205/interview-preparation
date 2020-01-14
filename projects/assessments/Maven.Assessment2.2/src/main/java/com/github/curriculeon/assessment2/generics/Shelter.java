package com.github.curriculeon.assessment2.generics;


import com.github.curriculeon.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<someAgeable extends Ageable> implements Iterable<someAgeable>  {
    List<someAgeable> ageableList;

    public Shelter() {

        this.ageableList = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return ageableList.size();
    }

    public void add(someAgeable object) {
        ageableList.add(object);
    }

    public Boolean contains(someAgeable object) {
        return ageableList.contains(object);
    }

    public void remove(someAgeable object) {
        ageableList.remove(object);
    }

    public someAgeable get(Integer index) {
        return ageableList.get(index);
    }

    public Integer getIndexOf(someAgeable ageable) {
        for(int i =0 ;i<ageableList.size(); i++){
            if(get(i).equals(ageable)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<someAgeable> iterator() {
        return ageableList.iterator();
    }
}