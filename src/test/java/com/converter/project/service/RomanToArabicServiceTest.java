package com.converter.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class RomanToArabicServiceTest {

    @Autowired
    private RomanToArabicService romanToArabicService;

    @Test
    void convert() {
        assertEquals(1, romanToArabicService.convert("I"));
        assertEquals(5, romanToArabicService.convert("V"));
        assertEquals(2, romanToArabicService.convert("II"));
        assertEquals(3, romanToArabicService.convert("III"));
        assertEquals(4, romanToArabicService.convert("IV"));
        assertEquals(6, romanToArabicService.convert("VI"));
        assertEquals(7, romanToArabicService.convert("VII"));
        assertEquals(8, romanToArabicService.convert("VIII"));
        assertEquals(9, romanToArabicService.convert("IX"));
        assertEquals(10, romanToArabicService.convert("X"));
        assertEquals(11, romanToArabicService.convert("XI"));
        assertEquals(12, romanToArabicService.convert("XII"));
        assertEquals(13, romanToArabicService.convert("XIII"));
        assertEquals(14, romanToArabicService.convert("XIV"));
        assertEquals(15, romanToArabicService.convert("XV"));
        assertEquals(20, romanToArabicService.convert("XX"));
        assertEquals(21, romanToArabicService.convert("XXI"));
        assertEquals(30, romanToArabicService.convert("XXX"));
        assertEquals(40, romanToArabicService.convert("XL"));
        assertEquals(50, romanToArabicService.convert("L"));
        assertEquals(100, romanToArabicService.convert("C"));
        assertEquals(500, romanToArabicService.convert("D"));
        assertEquals(1000, romanToArabicService.convert("M"));

    }


}
