package com.calc.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calc.demo.operations.Operartions;
import com.calc.demo.util.NumbersToBeMinMax;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@RestController
@RequestMapping("/calculatorapi/v1")
public class OperationController {
	
	ArrayList<Integer> list;
	@Autowired
	Operartions operartions;
	
	@GetMapping("/add")
	@ResponseBody
	public String addition(@RequestParam int a,@RequestParam int b) {
		int result= operartions.doAddition(a, b);
		return "Result "+ result;
	}
	
	
	@GetMapping("/sub")
	@ResponseBody
	public String substract(@RequestParam int a,@RequestParam int b) {
		int result= operartions.doSubstract(a, b);
		return "Result "+ result;
	}
	
	@GetMapping("/multiply")
	@ResponseBody
	public String multiply(@RequestParam int a,@RequestParam int b) {
		int result= operartions.doMultiply(a, b);
		return "Result "+ result;
	}
	
	@GetMapping("/div")
	@ResponseBody
	public String divide(@RequestParam int a,@RequestParam int b) {
		int result= operartions.doDivide(a, b);
		return "Result "+ result;
	}
	
	@GetMapping("/square")
	@ResponseBody
	public String square(@RequestParam int a) {
		int result= operartions.doSquare(a);
		return "Result "+ result;
	}
	
	@GetMapping("/squareRoot")
	@ResponseBody
	public String squareRoot(@RequestParam int a) {
		Double result= operartions.doSquareRoot(a);
		return "Result "+ result;
	}
	
	@GetMapping("/fact")
	@ResponseBody
	public String factorial(@RequestParam int a) {
		int result= operartions.doFactorial(a);
		return "Result "+ result;
	}
	
	@PostMapping("/minmax")
	@ResponseBody
public String findMinMax(@RequestBody NumbersToBeMinMax numberList) {
		
		int min=0;
		int max=0;
		
		List<Integer> list=new ArrayList<>();
		for(Integer i: numberList.getNumbersToBeMinMax()) {
			list.add(i);
		}
String result=operartions.getMinMax(list, min, max);
	return result;
}
	

}
