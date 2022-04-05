package com.converter.project.service;

import com.converter.project.domain.enums.Numbers;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArabicToRomanService {

    public String  convert(Integer arabicNumber) {
        String romanNumber = "";
        int[] arabicNumbers = Arrays.stream(Numbers.values()).mapToInt(Numbers::getValue).toArray();
        String[] romanNumbers = Arrays.stream(Numbers.values()).map(Numbers::getRoman).toArray(String[]::new);
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
}
