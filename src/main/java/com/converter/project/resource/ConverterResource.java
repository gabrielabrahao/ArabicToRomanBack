package com.converter.project.resource;

import com.converter.project.service.ArabicToRomanService;
import com.converter.project.service.RomanToArabicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/converter")
public class ConverterResource {

    @Autowired
    private ArabicToRomanService arabicToRomanService;

    @Autowired
    private RomanToArabicService romanToArabicService;

    @GetMapping("/arabicToRoman")
    public Map<String, String> arabicToRoman(@RequestParam Integer value) {
        Map<String, String> arabicToRomanMap = new HashMap<>();
        String convert = arabicToRomanService.convert(value);
        arabicToRomanMap.put("romanNumber", convert);
        return arabicToRomanMap;
    }

    @GetMapping("/romanToArabic")
    public Map<String, Integer> romanToArabic(@RequestParam String value) {
        Map<String, Integer> romanToArabicMap = new HashMap<>();
        Integer convert = romanToArabicService.convert(value);
        romanToArabicMap.put("arabicNumber", convert);
        return romanToArabicMap;
    }


}
