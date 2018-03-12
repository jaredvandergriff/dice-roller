package diceroller;

import java.util.Random;

public class Die {
    private int maxVal;

    public Die(){
        maxVal = 1;
    }

    public Die(int m){
        maxVal = m;
    }

    public int roll(){
        final int minVal = 1;
        Random rand = new Random();
        return rand.nextInt((maxVal - minVal) + 1) + minVal;
    }

}
