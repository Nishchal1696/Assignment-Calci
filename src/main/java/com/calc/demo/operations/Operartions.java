package com.calc.demo.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Operartions {

	public int doAddition(int a, int b) {
		return a+b;
	}
	
	public int doSubstract(int a, int b) {
		return a-b;
	}
	
	public int doMultiply(int a, int b) {
		return a*b;
	}
	
	public int doDivide(int a, int b) {
		return a/b;
	}
	public int doSquare(int a) {
		return a*a;
	}
	public double doSquareRoot(int a) {
		return Math.sqrt(a);
	}
	public int doFactorial(int a) {
		 int res = 1, i; 
	        for (i = 2; i <= a; i++) 
	            res *= i; 
	        return res; 
	}
	
	public String getMinMax(List<Integer> list,int min, int max) {
		min=Collections.min(list);
		max=Collections.max(list);
		return"Min=" +min+", Max="+max;
	}
}
