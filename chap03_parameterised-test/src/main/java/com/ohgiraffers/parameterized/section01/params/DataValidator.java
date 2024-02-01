package com.ohgiraffers.parameterized.section01.params;

import java.time.Month;

public class DataValidator {

    public static boolean inCollect(Month month){

        int monthValue = month.getValue();
        return monthValue >= 1 && monthValue <= 12; // 1월~12월 사이
    }

    public static int getLastDayOf(Month month){

        return month.maxLength(); // 마지말 날 체그
    }
}
