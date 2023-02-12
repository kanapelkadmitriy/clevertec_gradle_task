package com.clevertec.task_01;

import java.math.BigDecimal;

public class StringUtils {

    public static Integer ZERO = 0;

    public static boolean isPositiveNumber(String number) {
        return org.apache.commons.lang3.StringUtils.isNumericSpace(number) && ZERO <= Integer.parseInt(number);
    }
}
