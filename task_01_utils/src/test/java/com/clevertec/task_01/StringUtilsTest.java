package com.clevertec.task_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringUtilsTest {

    @Test
    public void isPositiveNumber() {
        String number = "12";
        assertTrue(StringUtils.isPositiveNumber(number));
    }

    @Test
    public void isNegativeNumber() {
        String number = "-12";
        assertFalse(StringUtils.isPositiveNumber(number));
    }
}
