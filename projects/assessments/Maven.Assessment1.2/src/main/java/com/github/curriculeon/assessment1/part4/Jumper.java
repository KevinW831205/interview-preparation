package com.github.curriculeon.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer flagHeight = k;
        Integer jumpHeight = j;

        return flagHeight/jumpHeight + flagHeight%jumpHeight;
    }
}
