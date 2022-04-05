package com.converter.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArabicToRomanServiceTest {

    @Autowired
    private ArabicToRomanService arabicToRomanService;

    @Test
    void convert() {
        assertEquals("I", arabicToRomanService.convert(1));
        assertEquals("II", arabicToRomanService.convert(2));
        assertEquals("III", arabicToRomanService.convert(3));
        assertEquals("IV", arabicToRomanService.convert(4));
        assertEquals("V", arabicToRomanService.convert(5));
        assertEquals("VI", arabicToRomanService.convert(6));
        assertEquals("VII", arabicToRomanService.convert(7));
        assertEquals("VIII", arabicToRomanService.convert(8));
        assertEquals("IX", arabicToRomanService.convert(9));
        assertEquals("X", arabicToRomanService.convert(10));
        assertEquals("XI", arabicToRomanService.convert(11));
        assertEquals("XII", arabicToRomanService.convert(12));
        assertEquals("XIII", arabicToRomanService.convert(13));
        assertEquals("XIV", arabicToRomanService.convert(14));
        assertEquals("XV", arabicToRomanService.convert(15));
        assertEquals("XVI", arabicToRomanService.convert(16));
        assertEquals("XVII", arabicToRomanService.convert(17));
        assertEquals("XVIII", arabicToRomanService.convert(18));
        assertEquals("XIX", arabicToRomanService.convert(19));
        assertEquals("XX", arabicToRomanService.convert(20));
        assertEquals("XXI", arabicToRomanService.convert(21));
        assertEquals("XXII", arabicToRomanService.convert(22));
        assertEquals("XXIII", arabicToRomanService.convert(23));
    }

}
