package by.epamtc.melnikov.task03.constant;

public final class StringConstants {

	private StringConstants() {}
	
	public static String WORD_CHARACTER_PATTERN = "[^\s.,!?:;'\"@#$%^&*()+=]";
	public static String CONSONANT_LETTER_PATTERN = "(?ui:[^aeiouyаеёиоуыэюя])";
	
	public static final String ENTER_INTEGER = "Введите целое число: ";
	public static final String ENTER_STRING = "Введите строку: ";
	public static final String ENTER_ARRAY_CAPASITY = "Введите размерность массива: ";
	public static final String ENTER_ARRAY_ELEMENTS = "Введите элементы массива: ";
	public static final String ENTER_JAGGED_ARRAY_ELEMENTS = "Введите эелементы массива массивов: ";
	public static final String ENTER_CHARACTER = "Введите символ: ";
	public static final String ENTER_INDEX = "Введите индекс: ";
	
	public static final String MAX_ELEMENT = "\nМаксимальный элемент: ";
	public static final String MIN_ELEMENT = "\nМинимальный элемент: ";
	public static final String FIBONACCI_NUMBERS = "\nЧисла Фибонначи: ";
	public static final String PRIME_NUMBERS = "\nПростые числа: ";
	public static final String UNIQUE_THREE_DIGIT_NUMBERS = "\nУникальные трехзначные числа: ";
    
	public static final String ARRAY_MENU = "\tПрограмма для работы с целочисленным массивом\t\n" +
											"Введите 1 для сортировки массива методом вставок\n" +
											"Введите 2 для сортировки массива методом выбора\n" +
											"Введите 3 для сортировки массива методом Шелла\n" +
											"Введите 4 чтобы вывести максимальный и минимальный элементы массива\n" +
											"Введите 5 чтобы получить все простые числа из массива\n" +
											"Введите 6 чтобы получить все числа Фибонначи из массива\n" +
											"Введите 7 чтобы получить все трехзначные числа состоящие\n" +
											"из разных цифер\n" +
											"Введите 0 чтобы закончить работу";
	
	public static final String JAGGED_ARRAY_MENU = "\tПрограмма для работы с массивом целочисленных массивов\t\n" +
													"Введите 1 для сортировки строк в порядке возрастания\n" +
													"по максимальному элементу строки\n" +
													"Введите 2 для сортировки строк в порядке возрастания\n" +
													"по минимальному элементу строки\n" +
													"Введите 3 для сортировки строк в порядке возрастания\n" +
													"по сумме элементов строки\n" +
													"Введите 4 для сортировки строк в порядке убывания\n" +
													"по максимальному элементу строки\n" +
													"Введите 5 для сортировки строк в порядке убывания\n" +
													"по минимальному элементу строки\n" +
													"Введите 6 для сортировки строк в порядке убывания\n" +
													"по сумме элементов строки\n" +
													"Введите 0 чтобы закончить работу";
	
	public static final String STRING_MENU = "\tПрограмма для работы с текстом\t\n" +
											 "Введите 1 для замены k-ой буквы каждого слова заданным символом\n" +
											 "Введите 2 для корректировки слов\n" +
											 "Введите 3 для заменны слов заданной длинны заданной подстрокой\n" +
											 "Введите 4 для корректировки текста\n" +
											 "Введите 5 для удаления всех слов заданной длинны начинующихся с согласной буквы\n" +
											 "Введите 0 чтобы закончить работу";
}
