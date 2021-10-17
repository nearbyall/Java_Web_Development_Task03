package by.epamtc.melnikov.task03.logic.impl;

import by.epamtc.melnikov.task03.logic.NumbersLogic;

public class NumbersLogicImpl implements NumbersLogic {

	@Override
	public boolean isPrimeNumber(int number) {
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) return false; 
		}
	
		return (number > 1);
	}

	@Override
	public boolean isFibonacciNumber(int number) {
		
		int fib1 = 0;
	    int fib2 = 1;
	    do {
	        int temp = fib1;
	        fib1 = fib2;
	        fib2 = temp + fib2;
	        }
	    while (fib2 < number);

	    if (fib2 == number) {
	    	return true;
	    } else {
	    	return false;
	    }
	        
	}

	@Override
	public boolean isUniqueNumber(int number) {
		
		int[] digits = findDigitsByNumber(number);
		
		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < digits.length; j++) {
				if ((j != i) && (digits[i] == digits[j])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public int findDigitsCount(int number) {
		
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		
		return count;
		
	}
	
	@Override
	public int[] findDigitsByNumber(int number) {
		
		int[] digits = new int[findDigitsCount(number)];
		
		int i = 0;
		while (number != 0) {
			int digit = number % 10;
			number /= 10;
			digits[i] = digit;
			i++;
		}
		
		return digits;
	}
	
	@Override
	public int[] findPrimeNumbers(int[] numbers) {
		
		int[] primeNumbers;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (isPrimeNumber(numbers[i])) {
				count++;
			}
		}
		
		if (count < 0) {
			return null;
		}
		
		primeNumbers = new int[count];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (isPrimeNumber(numbers[i])) {
				primeNumbers[j] = numbers[i];
				j++;
			}
		}
		
		return primeNumbers;
		
	}

	@Override
	public int[] findUniqueNumbers(int[] numbers) {
		
		int[] uniqueNumbers;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (isUniqueNumber(numbers[i])) {
				count++;
			}
		}
		
		if (count < 0) {
			return null;
		}
		
		uniqueNumbers = new int[count];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (isUniqueNumber(numbers[i])) {
				uniqueNumbers[j] = numbers[i];
				j++;
			}
		}
		
		return uniqueNumbers;
		
	}
	
	@Override
	public int[] findThreeDigitNumbers(int[] numbers) {
		
		int[] threeDigitNumbers;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (findDigitsCount(numbers[i]) == 3) {
				count++;
			}
		}
		
		if (count < 0) {
			return null;
		}
		
		threeDigitNumbers = new int[count];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (findDigitsCount(numbers[i]) == 3) {
				threeDigitNumbers[j] = numbers[i];
				j++;
			}
		}
		
		return threeDigitNumbers;
	}

	@Override
	public int[] findFibonacciNumbers(int[] numbers) {
		
		int[] fibonacciNumbers;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (isFibonacciNumber(numbers[i])) {
				count++;
			}
		}
		
		if (count < 0) {
			return null;
		}
		
		fibonacciNumbers = new int[count];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (isFibonacciNumber(numbers[i])) {
				fibonacciNumbers[j] = numbers[i];
				j++;
			}
		}
		
		return fibonacciNumbers;
		
	}
	
}
