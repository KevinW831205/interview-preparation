package com.github.curriculeon.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for(Object o: objectArray){
            if(o.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        List<Object> list = new ArrayList<>(Arrays.asList(objectArray));
        list.remove(objectToRemove);

        return list.toArray(new Object[0]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> map = new HashMap<>();
        for(Object o : objectArray){
            if(map.containsKey(o)){
                Integer currentCount = map.get(o);
                currentCount++;
                map.put(o, currentCount);
            } else {
                map.put(o,1);
            }
        }

        Set<Object> keys = map.keySet();
        Integer maxCount = 0;
        Object maxCountKey = new Object();
        for(Object key : keys){
            Integer count = map.get(key);
            if (count > maxCount){
                maxCount = count;
                maxCountKey = key;
            }
        }
        return maxCountKey;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> map = new HashMap<>();
        for(Object o : objectArray){
            if(map.containsKey(o)){
                Integer currentCount = map.get(o);
                currentCount++;
                map.put(o, currentCount);
            } else {
                map.put(o,1);
            }
        }

        Set<Object> keys = map.keySet();
        Integer minCount = map.get(objectArray[0]);
        Object minCountKey = objectArray[0];
        for(Object key : keys){
            Integer count = map.get(key);
            if (count < minCount){
                minCount = count;
                minCountKey = key;
            }
        }
        return minCountKey;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] result = new Object[objectArray.length + objectArrayToAdd.length - 2];
        for(int i = 0; i<objectArray.length; i++){
            result[i] = objectArray[i];
        }
        for(int i = 0; i<objectArrayToAdd.length; i++){
            result[i+objectArray.length] = objectArrayToAdd[i];
        }
        return result;
    }
}
