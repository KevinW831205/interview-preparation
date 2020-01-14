package com.github.curriculeon.assessment2.collections;

import java.lang.reflect.AnnotatedArrayType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    Map<Integer, String> monthMap = new HashMap<>();
    public void add(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String name = monthMap.get(monthNumber);
        if(name != null){
            return name;
        }
        throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Set<Integer> keyset = monthMap.keySet();
        for(Integer key: keyset){
            if(monthMap.get(key).equals(monthName)){
                return key;
            }
        }
        return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }


}
