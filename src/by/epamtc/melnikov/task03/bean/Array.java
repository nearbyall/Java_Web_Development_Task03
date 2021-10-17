package by.epamtc.melnikov.task03.bean;

import java.util.Arrays;

public class Array {

	private final int INIT_SIZE = 20;
	private final int CUT_RATE = 4;
	private int[] array;
	private int pointer;
	
	public Array() {
		array = new int[INIT_SIZE];
	}
	
	public Array(int size) {
		array = new int[size];
	}
	
	public Array(int[] array) {		
		this.array = array.clone();		
	}
	
	public int get(int index) {
		
		rangeCheck(index);
		
		return array[index];
		
	}
	
	public void set(int index, int value) {
		
		rangeCheck(index);
		
		array[index] = value;
		
	}
	
	public void add(int item) {
		
		if (pointer >= (array.length / 2)){
            resize(array.length * 2);
        }
		
        array[pointer++] = item;

	}
	
	public void swap(int firstIndex, int secondIndex) {
		
		rangeCheck(firstIndex, secondIndex);
		
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;	
		
	}
	
	public void remove(int index) {
		
		rangeCheck(index);
		
		for (int i = index; i < pointer; i++) {
	        array[i] = array[i+1];
		}
		
		array[pointer] = 0;
		pointer--;
		
		if (array.length > INIT_SIZE && pointer < (array.length / CUT_RATE)) {
			resize(array.length / 2);
		}
		
	}
	
	private void resize(int newLenght) {
		array = Arrays.copyOf(array, newLenght);
	}
	
	private void rangeCheck(int index) throws RuntimeException {
		
		if (index >= pointer || index < 0) {
            throw new IndexOutOfBoundsException(); 
        }
		
	}
	
	private void rangeCheck(int firstIndex, int secondIndex) throws RuntimeException {
		
		if (firstIndex >= pointer || secondIndex >= pointer ||
			firstIndex < 0 || secondIndex < 0){
            throw new IndexOutOfBoundsException(); 
        }
		
	}
	
	public int getPointer() {
		return pointer;
	}

	public int[] getArray() {
		return array.clone();
	}

	@Override
	public String toString() {
		
		return getClass().getSimpleName()
				+ " [array=" + Arrays.toString(array)
				+ ", pointer=" + pointer + "]";
		
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + CUT_RATE;
		result = prime * result + INIT_SIZE;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + pointer;
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		if (pointer != other.pointer)
			return false;
		return true;
		
	}
	
}
