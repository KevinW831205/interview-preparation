package com.github.curriculeon.assessment1.part1;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
//        String[] arr = str.split(" ");
//        String result = "";
//        for(int i=0 ;i<arr.length; i++){
//            result += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ";
//        }
//        return result.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] arr = str.split("");
        String result = "";
        for(int i=0; i<arr.length; i++){
            result += arr[arr.length - i - 1];
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase( reverse(str) );
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] arr = str.split("");
        String result = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].matches("[a-z]")){
                result += arr[i].toUpperCase();
            } else if (arr[i].matches("[A-Z]")){
                result += arr[i].toLowerCase();
            } else {
                result += arr[i];
            }
        }
        return result;
    }
}
