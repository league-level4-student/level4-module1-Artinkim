package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[arr.length+1];
		for(int i = 0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = val;
		arr = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arr.length+1];
		temp[loc] = val;
		for(int i = 0;i<loc;i++) {
			temp[i] = arr[i];
		}
		for(int i = loc+1;i<temp.length;i++) {
			temp[i] = arr[i-1];
		}
		arr = temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[arr.length-1];
		for(int i = 0;i<loc;i++) {
			temp[i] = arr[i];
		}
		for(int i = loc;i<temp.length;i++) {
			temp[i] = arr[i+1];
		}
		arr = temp;
	}
	
	public boolean contains(T val) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return arr.length;
	}
}