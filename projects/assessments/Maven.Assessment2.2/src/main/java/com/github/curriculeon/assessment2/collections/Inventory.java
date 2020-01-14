package com.github.curriculeon.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    List<String> strings;

    public Inventory(List<String> strings) {
        this.strings = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this(new ArrayList<>());
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        strings.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        strings.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer count = 0;
        for(String s : strings){
            if(s.equals(item)){
                count++;
            }
        }
        return count;
    }
}
