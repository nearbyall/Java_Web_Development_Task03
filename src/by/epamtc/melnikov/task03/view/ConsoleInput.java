package by.epamtc.melnikov.task03.view;

import java.util.Scanner;

public abstract class ConsoleInput {

	private static Scanner scanner = new Scanner(System.in);
	
	public static int enterInteger() {
		
		Integer value = null;
		
		do {
			
			while (!scanner.hasNextInt()) {
				
				scanner.next();
				
			}
			
			value = scanner.nextInt();
			
		} while (value == null);
		
		return value;
		
	}
	
	public static int enterPositiveInteger() {
		
		Integer value;
		
		do {
			value = enterInteger();
		} while (value < 0);
		
		return value;
		
	}
	
	public static char enterCharacter() {
		
		 return enterString().charAt(0);
		 
	}
	
	public static String enterString() {
		
		String value = null;

		do {
        	
			while (!scanner.hasNext()) {

				scanner.next();
			}
			value = scanner.next();


		} while (value == null);
        
		return value;
		
	}
	
	public static int enterChoiseTask0301() {
		
		int choise;
		
		do {
			choise = enterInteger();
		} while (choise < 0 || choise > 7);
		
		return choise;
		
	}
	
	public static int enterChoiseTask0302() {
		
		int choise;
		
		do {
			choise = enterInteger();
		} while (choise < 0 || choise > 6);
		
		return choise;
			
	}
	
	public static int enterChoiseTask0303() {
		
		int choise;
		
		do {
			choise = enterInteger();
		} while (choise < 0 || choise > 5);
		
		return choise;
		
	}
	
	public static void close() {
		scanner.close();
	}
	
}
