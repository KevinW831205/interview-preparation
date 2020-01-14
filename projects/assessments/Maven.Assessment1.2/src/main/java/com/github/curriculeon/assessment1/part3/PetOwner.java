package com.github.curriculeon.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String name;
    Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        List<Pet> petList;
        if (this.pets == null) {
            petList = new ArrayList<>();
        } else {
            petList = new ArrayList<>(Arrays.asList(this.pets));
        }
        petList.add(pet);
        this.pets = petList.toArray(new Pet[0]);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> petList;
        if (this.pets == null) {
            petList = new ArrayList<>();
        } else {
            petList = new ArrayList<>(Arrays.asList(this.pets));
        }
        petList.remove(pet);
        if (petList.size() == 0){
            this.pets = new Pet[]{null};
        } else {
            this.pets = petList.toArray(new Pet[0]);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        List<Pet> petList = new ArrayList<>(Arrays.asList(this.pets));
        return petList.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngestAge = pets[0].getAge();
        for (Pet pet : pets) {
            youngestAge = Math.min(youngestAge, pet.getAge());
        }
        return youngestAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestAge = pets[0].getAge();
        for (Pet pet : pets) {
            oldestAge = Math.max(oldestAge, pet.getAge());
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sum = 0;
        for (Pet pet : pets) {
            sum += pet.getAge();
        }
        return sum.floatValue() / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
