package com.calc.demo.util;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class NumbersToBeMinMax {
	
	
	public Integer[] numbersToBeMinMax;

	public Integer[] getNumbersToBeMinMax() {
		return numbersToBeMinMax;
	}

	public void setNumbersToBeMinMax(Integer[] numbersToBeMinMax) {
		this.numbersToBeMinMax = numbersToBeMinMax;
	}

	@Override
	public String toString() {
		return "NumbersToBeMinMax [numbersToBeMinMax=" + Arrays.toString(numbersToBeMinMax) + "]";
	}

   
}
