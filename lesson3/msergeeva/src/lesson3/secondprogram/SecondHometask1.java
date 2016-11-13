package lesson3.secondprogram;

import java.util.Arrays;

class SecondHometask1{ 
  public static void main(String[] args) {
    int[] a = {1,2,3};
		int[] b = null;
		
		ArraysCopier arr = new ArraysCopier(a);
		System.out.println("Array: {" + arr + "}");
		
		b = arr.copyOf(5);
		ArraysCopier arr1 = new ArraysCopier(b);
		System.out.println("The new array with copyOf: {" + arr1 + "}");
		
		b = arr1.copyOfRange(2,5);
		ArraysCopier arr2 = new ArraysCopier(b);
		System.out.println("The new array with copyOfRange: {" + arr2 + "}");
		
		b = arr1.fill(8);
		ArraysCopier arr3 = new ArraysCopier(b);
		System.out.println("The fill array: {" + arr3 + "}");
  }
}	
class ArraysCopier{
  public int[] array = null;
	int[] k = null;
	
	public ArraysCopier(int[] array){
	  this.array = array;
	}
	public String toString() {
	  String k = " ";
		for (int i = 0; i < array.length; i++) {
		  k += Integer.toString(array[i]) + " ";
		}
	  return k;
	}
	public int[] copyOf(int newLength) {
	  k = new int[newLength];
		int j = 0;
		if (newLength >= array.length) {
		  j = array.length;
		} else {
		  j = newLength;
		}
		for(int i = 0; i < j; i++) {
		  k[i] = array[i];
		}
	   	return k;
	}
	public int[] copyOfRange(int from, int to) {
	  k = new int[to - from];
	  for(int j = 0; j < (to - from); j++){
	    k[j] = array[j + from];
	  }
	  return k;
	}
	public int[] fill(int value) {
	  k = new int[array.length];
	  for(int j = 0; j < array.length; j++) {
	    k[j] = value;
	  }
	  return k;  
	} 
}	
	
