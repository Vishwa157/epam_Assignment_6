/**
 * 
 */
package customList;

import java.util.Arrays;

/**
 * @author Vishwanath Reddy
 *
 */
public class CustomList<T> {
	
	private int sizeOfList = 0;
	
	private static final int capacityOfList = 10;
	
	private Object array[];
	
	public CustomList() {
		array = new Object[capacityOfList];
	}
	
	public void addElement(T t) {
		if(sizeOfList == array.length) {
			CapacityOfList();
		}
		
		array[sizeOfList++] = t;
	}
	
	@SuppressWarnings("Unchecked Warning!")
	public T getTheElement(int index) {
		if(index >= sizeOfList || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", sizeOfList " + index);
		}
		return (T) array[index];
	}

	@SuppressWarnings("Unchecked Warning!")
	public T removeElement(int index) {
		if(index >= sizeOfList || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", sizeOfList " + index);
		}
		
		Object object = array[index];
		int element = array.length - ( index + 1 );
		System.arraycopy( array, index + 1, array, index, element);
		sizeOfList--;
		
		return (T) object;
	}
	
	public int sizeOfList() {
		return sizeOfList;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append('[');
		for(int index = 0; index < sizeOfList; index++) {
			stringBuilder.append(array[index].toString());
			if(index < sizeOfList - 1) {
				stringBuilder.append(",");
			}
		}
		stringBuilder.append(']');
		return stringBuilder.toString();
	}
	
	private void CapacityOfList() {
		int newSizeOfList = array.length * 2;
		array = Arrays.copyOf(array, newSizeOfList);
	}

	
}
