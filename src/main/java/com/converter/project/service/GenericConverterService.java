package com.converter.project.service;

import org.springframework.stereotype.Service;

@Service
public abstract class GenericConverterService {

    public String convert(int arabicNumber) {
        String romanNumber = "";
        int[] arabicNumbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumbers = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int i = 0;
        while (arabicNumber > 0) {
            while (arabicNumber >= arabicNumbers[i]) {
                romanNumber += romanNumbers[i];
                arabicNumber -= arabicNumbers[i];
            }
            i++;
        }
        return romanNumber;
    }

    public String convert(String romanNumber) {
       // String romanNumber = "";
        int[] arabicNumbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumbers = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int i = 0;

        return "arabicNumbers";
    }


    public int converts(String romanNumber) {
        int arabicNumber = 0;
        int previousArabicNumber = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int currentArabicNumber = getArabicNumber(romanNumber.charAt(i));
            if (currentArabicNumber < previousArabicNumber) {
                arabicNumber -= currentArabicNumber;
            } else {
                arabicNumber += currentArabicNumber;
            }
            previousArabicNumber = currentArabicNumber;
        }
        return arabicNumber;
    }

    private int getArabicNumber(char romanNumber) {
        switch (romanNumber) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
