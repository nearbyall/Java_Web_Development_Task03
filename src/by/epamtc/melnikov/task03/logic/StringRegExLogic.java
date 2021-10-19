package by.epamtc.melnikov.task03.logic;

public interface StringRegExLogic {

	String replaseSymbol(String text, int index, char symbol);
	
	String removeUnnecessaryCharacters(String text);
	
	String removeConsonantWords(String text, int length);
	
	String correctWord(String word);
	
	String replaseWordWithSubstring(String text, int lenght, String replasement);
	
}
