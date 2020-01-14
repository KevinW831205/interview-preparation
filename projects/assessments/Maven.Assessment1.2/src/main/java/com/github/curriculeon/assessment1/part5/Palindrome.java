package com.github.curriculeon.assessment1.part5;

import com.github.curriculeon.assessment1.part1.BasicStringUtils;

public class Palindrome {



    public Integer countPalindromes(String input){
        Integer count = 0;
        for(int wordLength=1; wordLength<=input.length(); wordLength++){
            for(int index=0; index<input.length()-wordLength+1;index++){
                if( isPalindrome( input.substring(index,index+wordLength) ) ){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String input){
        return input.equals(BasicStringUtils.reverse(input));
    }

}
