package by.epamtc.melnikov.task03;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.NumbersLogic;

public class Task03Test {

	@Test
	public void isPrimeNumberTest() {

		LogicProvider logicProvider = LogicProvider.getInstance();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		int[] actualNumber = {14, 100, 11};
		boolean[] actualBoolean = {false, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			actualBoolean[i] = numbersLogic.isPrimeNumber(actualNumber[i]);
		}
		
		boolean[] expectedBoolean = {false, false, true};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}
	
	@Test
	public void isFibonacciNumberTest() {

		LogicProvider logicProvider = LogicProvider.getInstance();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		int[] actualNumber = {5, 8, 11};
		boolean[] actualBoolean = {false, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			actualBoolean[i] = numbersLogic.isFibonacciNumber(actualNumber[i]);
		}
		
		boolean[] expectedBoolean = {true, true, false};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}
	
	@Test
	public void isUniqueNumberTest() {

		LogicProvider logicProvider = LogicProvider.getInstance();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		int[] actualNumber = {598, 888, 121};
		boolean[] actualBoolean = {false, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			actualBoolean[i] = numbersLogic.isUniqueNumber(actualNumber[i]);
		}

		boolean[] expectedBoolean = {true, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}
	
	@Test
	public void findDigitsCountTest() {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		int[] actualNumber= {12312, 23, 1};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = numbersLogic.findDigitsCount(actualNumber[i]);
		}
		
		int[] expectedNumber = {5, 2, 1};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i]);
		}
		
	}
	
}
