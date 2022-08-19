package com.waves.factory;

import java.time.LocalDate;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/19 11:31
 */
public class LocalDateFactory {
    private int year,month,dayOfMonth;

    public LocalDateFactory(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public LocalDate createLocalDate(){
        return LocalDate.of(this.year,this.month,this.dayOfMonth);
    }
}
