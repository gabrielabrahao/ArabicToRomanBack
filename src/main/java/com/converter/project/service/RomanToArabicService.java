package com.converter.project.service;

import com.converter.project.domain.enums.Numbers;
import org.springframework.stereotype.Service;

@Service
public class RomanToArabicService {

    public int convert(String romanNumber) {
        int arabicNumber = 0;
        int previousArabicNumber = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            String romanNumberChar = String.valueOf(romanNumber.charAt(i));
            int currentArabicNumber = Numbers.toArabic(romanNumberChar);
            if (currentArabicNumber < previousArabicNumber) {
                arabicNumber -= currentArabicNumber;
            } else {
                arabicNumber += currentArabicNumber;
            }
            previousArabicNumber = currentArabicNumber;
        }
        return arabicNumber;
    }





}
