package by.epamtc.melnikov.task03.logic;

public interface StringLogic {

	String replaseSymbol(String text, int index, char symbol);
	
	String removeUnnecessaryCharacters(String text);
	
	String removeConsonantWords(String text, int length);
	
	String correctWord(String word);
	
	String addSpaces(String text);
	
	String replaceWordsWithSubstring(String text, String replacement, int length);
	
	void replaceWithSubstring(int start, int end, String replacement, StringBuilder original);
	
}
