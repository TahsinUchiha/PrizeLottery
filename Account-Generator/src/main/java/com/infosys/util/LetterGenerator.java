package com.infosys.util;

import org.springframework.stereotype.Component;

@Component
public class LetterGenerator {
	
	public String letterGenerator() {
		String[] letters = {"A", "B", "C" };
		return letters[(int)Math.floor(Math.random() * letters.length)];
	}

}
