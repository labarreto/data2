/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2;

import java.util.Random;

/**
 *
 * @author ldbruby95
 */
public class randInt implements Randomness<Integer> {

    public Integer createRand() {
        Random rand = new Random();
        int max = 100;
        int min = 0;
        return rand.nextInt((max - min) + 1) + min;
        
    }
}
