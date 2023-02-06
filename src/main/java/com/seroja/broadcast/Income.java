package com.seroja.service;

import lombok.Data;

@Data
public class IncomeCalculation {

    private int income = 0;

    public int sumIncome(int income, int priceForMinute, int duration){
        income = priceForMinute * duration;
        return income;
    }


}
