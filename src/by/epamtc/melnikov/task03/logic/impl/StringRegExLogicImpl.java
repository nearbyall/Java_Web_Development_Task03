package by.epamtc.melnikov.task03.logic.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.StringLogic;
import by.epamtc.melnikov.task03.logic.StringRegExLogic;

public class StringRegExLogicImpl implements StringRegExLogic {

	@Override
	public String replaseSymbol(String text, int index, char symbol) {

		Pattern pattern = Pattern.compile("(\\W{" + index + ",})");

		Matcher matcher = pattern.matcher(text);
		StringBuilder sb = new StringBuilder(text);

		while (matcher.find()){
			
			if(matcher.matches()){
				sb.setCharAt(index - 1, symbol);
			}
		}

		return sb.toString();
		
	}
	
	@Override
	public String removeUnnecessaryCharacters(String text) {

		StringBuilder sb = new StringBuilder(text);
		Pattern pattern = Pattern.compile("([a-zA-Zа-яА-Я ])+");
		Matcher matcher = pattern.matcher(sb);
		sb = new StringBuilder();
		
		while (matcher.find()) {
			sb.append(matcher.group());
		}
		
		for (int i = 0; i < sb.length(); i++) {
			if (i > 0 && sb.charAt(i) != ' ' && sb.charAt(i - 1) != ' ') {
				sb.insert(i, ' ');
			}	
		}
		
		return sb.toString();
		
	}

	@Override
	public String removeConsonantWords(String text, int length) {
		
		StringBuilder sb = new StringBuilder(text);
		Pattern pattern = Pattern.compile("(^" + StringConstants.CONSONANT_LETTER_PATTERN +
        		StringConstants.WORD_CHARACTER_PATTERN + "{" + (length - 1) + "," + (length - 1) + "})");
        Matcher matcher = pattern.matcher(sb);      
        sb = new StringBuilder();
        
        while (matcher.find()) {
        	sb.append(matcher.group());
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
	public String replaseWordWithSubstring(String text, int lenght, String replasement) {

		StringBuilder sb = new StringBuilder(text);
		Pattern pattern = Pattern.compile(StringConstants.WORD_CHARACTER_PATTERN + "+");
		Matcher matcher = pattern.matcher(sb);
        
		int offset = 0;
		while (matcher.find()) {
			if (matcher.group().length() == lenght) {
				sb.replace(matcher.start() + offset, matcher.end() + offset, replasement);
				offset += replasement.length() - (matcher.end() - matcher.start());
			}
		}
		        
		return sb.toString();

	}

}
