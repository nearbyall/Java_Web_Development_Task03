package by.epamtc.melnikov.task03.logic;

import by.epamtc.melnikov.task03.logic.impl.ArrayLogicImpl;
import by.epamtc.melnikov.task03.logic.impl.NumbersLogicImpl;

public class LogicProvider {
	
	private LogicProvider() {}
	
	private static class LogicProviderHolder {
		
		public static final LogicProvider HOLDER_INSTANCE = new LogicProvider();
		
	}
	
	public static LogicProvider getInstance() {
		return LogicProviderHolder.HOLDER_INSTANCE;
	}
	
	private final ArrayLogic arrayLogic = new ArrayLogicImpl();
	private final NumbersLogic numbersLogic = new NumbersLogicImpl();
	
	public ArrayLogic getArrayLogic() {
		return arrayLogic;
	}
	
	public NumbersLogic getNumbersLogic() {
		return numbersLogic;
	}
	
}
