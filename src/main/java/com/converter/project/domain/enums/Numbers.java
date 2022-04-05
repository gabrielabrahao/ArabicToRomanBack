package com.converter.project.domain.enums;

public enum Numbers {
	THOUSAND(1000,"M"),
	NINE_HUNDRED(900,"CM"),
	FIVE_HUNDRED(500,"D"),
	FOUR_HUNDRED(400,"CD"),
	HUNDRED(100,"C"),
	NINETY(90,"XC"),
	FIFTY(50,"L"),
	FORTY(40,"XL"),
	TEN(10,"X"),
	NINE(9,"IX"),
	FIVE(5,"V"),
	FOUR(4,"IV"),
	ONE(1, "I");

	private final Integer value;
	private final String roman;

	private Numbers(Integer id, String description) {
		this.value = id;
		this.roman = description;
	}



	public Integer getValue() {
		return value;
	}

	public String getRoman() {
		return roman;
	}



	public static String toRoman(Integer id) {
		if(id == null) {
			return null;
		}

		for(Numbers x : Numbers.values()) {
			if(id.equals(x.getValue())) {
				return x.getRoman();
			}
		}

		throw new IllegalArgumentException("Id inválido: " + id);
	}

	public static Integer toArabic(String description) {
		if(description == null) {
			return null;
		}

		for(Numbers x : Numbers.values()) {
			if(description.equals(x.getRoman())) {
				return x.value;
			}
		}

		throw new IllegalArgumentException("Descrição inválida: " + description);
	}

	public static Integer toArabic(Integer value) {
		if(value == null) {
			return null;
		}

		for(Numbers x : Numbers.values()) {
			if(value.equals(x.getRoman())) {
				return x.value;
			}
		}

		throw new IllegalArgumentException("Descrição inválida: " + value);
	}
}


