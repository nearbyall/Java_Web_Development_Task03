package by.epamtc.melnikov.task03.logic;

public interface NumbersLogic {

	boolean isPrimeNumber(int number);
	
	boolean isFibonacciNumber(int number);
	
	boolean isUniqueNumber(int number);
	
	int findDigitsCount(int number);
	
	int[] findDigitsByNumber(int number);
	
	int[] findPrimeNumbers(int[] numbers);
	
	int[] findFibonacciNumbers(int[] numbers);
	
	int[] findUniqueNumbers(int[] numbers);
	
	int[] findThreeDigitNumbers(int[] numbers);
	
}
