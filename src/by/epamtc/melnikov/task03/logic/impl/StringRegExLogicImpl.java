package by.epamtc.melnikov.task03.logic.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.StringLogic;
import by.epamtc.melnikov.task03.logic.StringRegExLogic;

public class StringRegExLogicImpl implements StringRegExLogic {

	@Override
	public String replaseSymbol(String text, int index, char symbol) {
		
		int replacementIndex = index - 1;
		StringBuilder sb = new StringBuilder(text);
		Pattern pattern = Pattern.compile("\\b\\w+");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			if (replacementIndex <= (matcher.end() - matcher.start() - 1)) {
				int i = matcher.start() + replacementIndex;
				sb.replace(i, i + 1, Character.toString(symbol));
			}
		}

		return sb.toString();
		
	}
	
	@Override
	public String removeUnnecessaryCharacters(String text) {
		return text.replaceAll("[^A-Za-z ]", "");
	}

	@Override
	public String removeConsonantWords(String text, int length) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		StringLogic stringLogic = logicProvider.getStringLogic();
			
		StringBuilder sb = new StringBuilder(text);
		
		Pattern pattern = Pattern.compile("\\b[qwrtpsdfghjklzxcvbnm]+");
		Matcher matcher = pattern.matcher(text);
		int indexCorrection = 0;

		while (matcher.find()) {
			stringLogic.replaceWithSubstring(matcher.start() - indexCorrection,
					matcher.end() - indexCorrection, "", sb);
			indexCorrection += length;
		}

		return sb.toString();
        
	}

	@Override
	public String correctWord(String word) {
		
		Pattern pattern = Pattern.compile("PA");
		Matcher matcher = pattern.matcher(word);

		StringBuilder sb = new StringBuilder(word);
        
		while (matcher.find()) {
			sb.replace(matcher.start() + 1, matcher.end(), "O");
		}

		return sb.toString();
    
	}

	@Override
	public String addSpaces(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		
		return sb.toString();
		
	}
	
	@Override
	public String replaceWordsWithSubstring(String text, String replacement, int length) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		StringLogic stringLogic = logicProvider.getStringLogic();
		
		StringBuilder sb = new StringBuilder(text);
		Pattern pattern = Pattern.compile("\\b\\w+");
		Matcher matcher = pattern.matcher(text);
		int replacedCount = 0;
		int indexCorrection = replacement.length() - length + replacedCount;

		while (matcher.find()) {
			if (length == (matcher.end() - matcher.start())) {
				stringLogic.replaceWithSubstring(matcher.start() + indexCorrection * replacedCount,
						matcher.end() - 1 + indexCorrection * replacedCount, replacement, sb);
				replacedCount++;
			}
		}

		return sb.toString();
        
	}

}
