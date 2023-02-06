package com.seroja.service;

import lombok.Data;

@Data
public class DurationCalculation {
    private int durationForCalc;
    public boolean checkDuration(int duration) {
        if((duration <= 0))  {
            System.out.println("Reached broadcast duration limit!");
            return true;
        }
        return false;
    }

}
