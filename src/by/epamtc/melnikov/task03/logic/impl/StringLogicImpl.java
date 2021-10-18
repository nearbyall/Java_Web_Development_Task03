package by.epamtc.melnikov.task03.logic.impl;

import java.util.Set;

import by.epamtc.melnikov.task03.logic.StringLogic;

public class StringLogicImpl implements StringLogic {

	@Override
	public String replaseSymbol(String text, int index, char symbol) {
	
		StringBuilder sb = new StringBuilder();
		
		if (text != null && text.length() > 0 && index > 0) {
			for (String word : text.split(" ")) {
				if (word.length() >= index) {
					sb.append(word.substring(0, index - 1)).append(symbol).append(word.substring(index, word.length()));
				} else {
					sb.append(word);
				}
				sb.append(" ");
			}
		}
        
		return sb.toString();
		
	}

	@Override
	public String removeUnnecessaryCharacters(String text) {

		StringBuilder sb = new StringBuilder();
		char character;
		
		for (int i = 0; i < text.length(); i++) {
			character = text.charAt(i);
			if ((character > 64 && character < 91) || (character > 96 && character < 123) || (character == ' ')) {
				sb.append(character);
			}
		}
		
		return sb.toString();
		
	}
	
	@Override
	public String removeConsonantWords(String text, int length) {
		
		Set<Character> consonants = Set.of('q', 'w', 'r', 't', 'p', 's', 'd',
		 			'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm');
		StringBuilder sb = new StringBuilder();
		char character;
		int wordBegin = 0;
		int wordEnd = 0;
		int indexCorrection = 0;

		for (int i = 0; i < text.length(); i++) {
			character = text.charAt(i);
			if (character == ' ') {
				wordEnd = i - 1;
				if ((wordEnd - wordBegin + 1 == length) && consonants.contains(text.charAt(wordBegin))) {
					replaceWithSubstring(wordBegin - indexCorrection, wordEnd - indexCorrection, "", sb);
					indexCorrection += length;
				}
				wordBegin = i + 1;
				sb.append(" ");
			} else {
				sb.append(character);
				wordEnd++;
			}
		}
		if ((wordEnd - wordBegin + 1 == length) && consonants.contains(text.charAt(wordBegin))) {
			replaceWithSubstring(wordBegin - indexCorrection, wordEnd - indexCorrection, "", sb);
		}

		return sb.toString();
	        
	}

	@Override
	public String correctWord(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		boolean isPreP = false;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (isPreP && (word.charAt(i) == 'A')) {
				sb.replace(i, i + 1, "O");
			}
			
			if (word.charAt(i) == 'P') {
				isPreP = true;
			}
			
		}
		
		return sb.toString();
	}
	
	@Override
	public String addSpaces(String text) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text.length() - 1; i++) {
			
			sb.append(text.charAt(i));
			
			if (text.charAt(i) == text.charAt(i + 1)) {
				sb.append(' ');
			}
			
		}
		
		sb.append(text.charAt(text.length() - 1));
		
		return sb.toString();
		
	}
	
	@Override
	public String replaceWordsWithSubstring(String text, String replacement, int length) {
	
		int wordBegin = 0;
		int wordEnd = 0;
		StringBuilder sb = new StringBuilder();
		int replacedCount = 0;
		int indexCorrection = replacement.length() - length + replacedCount;
		char c;

		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			if (c == ' ') {
				wordEnd = i - 1;
				if (wordEnd - wordBegin + 1 == length) {
					replaceWithSubstring(wordBegin + indexCorrection * replacedCount,
							wordEnd + indexCorrection * replacedCount, replacement, sb);
					replacedCount++;
				}
				wordBegin = i + 1;
				sb.append(" ");
			} else {
				sb.append(c);
				wordEnd++;
			}
		}
		if (wordEnd - wordBegin == length) {
			replaceWithSubstring(wordBegin, wordEnd, replacement, sb);
		}

		return sb.toString();
		
	}
	
	@Override
	public void replaceWithSubstring(int start, int end, String replacement, StringBuilder original) {
		
		original.delete(start, end + 1);
		original.insert(start, replacement);
        
	}

}
