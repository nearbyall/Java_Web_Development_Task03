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
		array.add(14);
		array.add(99);
		array.add(-99);
		array.add(15);
		array.add(53);
		array.add(55);
		
		arrayLogic.shellSort(array);
		
		for (int i = 0; i < array.getPointer(); i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("Asdasd" + arrayLogic.findBiggestElementIndex(array));
		
	}
	
	
}
