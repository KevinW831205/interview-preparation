package com.github.curriculeon.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String result = "";
        for(int i= stringToBePadded.length(); i<amountOfPadding;i++){
            result += " ";
        }
        result += stringToBePadded;
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String result = "";
        result += stringToBePadded;
        for(int i= stringToBePadded.length(); i<amountOfPadding;i++){
            result += " ";
        }
        return result;

    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";
        for(int i=0; i<numberOfTimeToRepeat; i++){
            result += stringToBeRepeated;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String regex = "^[A-Za-z\\s]+$";
        return string.matches(regex);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String regex = "^[0-9]+$";
        return string.matches(regex);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String regex = "^[`~!@#$%^&*()_+\\-\\\\=;:'\"?/.,<>]+$";
        return string.matches(regex);
    }
}
