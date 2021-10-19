package by.epamtc.melnikov.task03.main;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.view.ConsoleInput;
import by.epamtc.melnikov.task03.view.ConsoleMenu;
import by.epamtc.melnikov.task03.view.ConsoleOutput;

public class Main {
	
	public static void main(String[] args) {

		runTask0301();
		
		runTask0302();
		
		runTask0303();
		
	}
	
	public static void runTask0301() {
		
		ConsoleOutput.printMessage(StringConstants.ENTER_ARRAY_CAPASITY);
		int capasity = ConsoleInput.enterInteger();
		
		Array array = new Array(capasity);
		
		ConsoleOutput.printMessage(StringConstants.ENTER_ARRAY_ELEMENTS);
		for (int i = 0; i < capasity; i++) {
			ConsoleOutput.printMessage(StringConstants.ENTER_INTEGER);
			array.add(ConsoleInput.enterInteger());
		}
		
		ConsoleMenu.choiseProccesingTask0301(array);
		
	}
	
	public static void runTask0302() {
		
		ConsoleOutput.printMessage(StringConstants.ENTER_ARRAY_CAPASITY);
		int capasity = ConsoleInput.enterInteger();
		
		int[][] jaggedArray = new int[capasity][];
		
		ConsoleOutput.printMessage(StringConstants.ENTER_JAGGED_ARRAY_ELEMENTS);
		for (int i = 0; i < capasity; i++) {
			ConsoleOutput.printMessage(StringConstants.ENTER_ARRAY_CAPASITY);
			jaggedArray[i] = new int[ConsoleInput.enterInteger()];
			
			for (int j = 0; j < jaggedArray[i].length; j++) {
				ConsoleOutput.printMessage(StringConstants.ENTER_INTEGER);
				jaggedArray[i][j] = ConsoleInput.enterInteger();
			}
		}
		
		ConsoleMenu.choiseProccesingTask0302(jaggedArray);
		
	}
	
	public static void runTask0303() {
		
		ConsoleOutput.printMessage(StringConstants.ENTER_STRING);
		String text = ConsoleInput.enterString();
		
		ConsoleMenu.choiseProccesingTask0303(text);
		
	}
	
	
	
}
