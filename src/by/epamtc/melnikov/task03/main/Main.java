package by.epamtc.melnikov.task03.main;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.NumbersLogic;
import by.epamtc.melnikov.task03.view.ConsoleInput;
import by.epamtc.melnikov.task03.view.ConsoleOutput;
import by.epamtc.melnikov.task03.view.ConsoleProvider;

public class Main {
	
	public static void main(String[] args) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		
		ArrayLogic arrayLogic = logicProvider.getArrayLogic();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		ConsoleProvider consoleProvider = ConsoleProvider.getInstance();
		
		ConsoleInput consoleInput = consoleProvider.getConsoleInput();
		ConsoleOutput consoleOutput = consoleProvider.getConsoleOutput();
		
		Array array = new Array();
		array.add(5);
		array.add(-9);
		array.add(3);
		array.add(144);
		array.add(99);
		array.add(-99);
		array.add(125);
		array.add(53);
		array.add(55);
		
		arrayLogic.shellSort(array);
		
		int[] numbers = array.getArray();
		int[] numbers1 = numbersLogic.findThreeDigitNumbers(numbers);
		
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
		System.out.println("Asdasd" + arrayLogic.findBiggestElementIndex(array));
		
	}
	
	public static void runTask0301() {
		
	}
	
	public static void runTask0302() {
		
	}
	
	public static void runTask0303() {
		
	}
	
}
