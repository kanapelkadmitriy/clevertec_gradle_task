package com.clevertec;


import com.clevertec.task_01.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... numbers) {
        boolean result = true;
        for (String number : numbers) {
            result = result && StringUtils.isPositiveNumber(number);
        }
        return result;
    }
}


