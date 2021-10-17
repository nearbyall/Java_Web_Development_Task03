package by.epamtc.melnikov.task03.logic;

import by.epamtc.melnikov.task03.logic.impl.ArrayLogicImpl;
import by.epamtc.melnikov.task03.logic.impl.JaggedArrayLogicImpl;
import by.epamtc.melnikov.task03.logic.impl.NumbersLogicImpl;
import by.epamtc.melnikov.task03.logic.impl.StringLogicImpl;

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
	private final JaggedArrayLogic jaggedArrayLogic = new JaggedArrayLogicImpl();
	private final StringLogic stringLogic = new StringLogicImpl();
	
	public ArrayLogic getArrayLogic() {
		return arrayLogic;
	}
	
	public NumbersLogic getNumbersLogic() {
		return numbersLogic;
	}

	public JaggedArrayLogic getJaggedArrayLogic() {
		return jaggedArrayLogic;
	}

	public StringLogic getStringLogic() {
		return stringLogic;
	}
	
}
