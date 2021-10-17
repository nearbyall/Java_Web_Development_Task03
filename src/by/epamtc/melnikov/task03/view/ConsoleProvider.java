package by.epamtc.melnikov.task03.view;

public class ConsoleProvider {
	
	private ConsoleProvider() {}
	
	private static class ConsoleProviderHolder {
		
		public static final ConsoleProvider HOLDER_INSTANCE = new ConsoleProvider();
		
	}

	public static ConsoleProvider getInstance() {
		return ConsoleProviderHolder.HOLDER_INSTANCE;
	}
	
	private final ConsoleOutput consoleOutput = new ConsoleOutput();
	private final ConsoleInput consoleInput = new ConsoleInput();
	private final ConsoleMenu consoleMenu = new ConsoleMenu();
	
	public ConsoleOutput getConsoleOutput() {
		return consoleOutput;
	}
	
	public ConsoleInput getConsoleInput() {
		return consoleInput;
	}
	
	public ConsoleMenu getConsoleMenu() {
		return consoleMenu;
	}
	
}
