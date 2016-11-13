import main.java.*;

public class Main {
  public static void main(String...args) {
    PascalTriangle a = new PascalTriangle(5);
    a.calculation();
    a.print();	
    a.print("even");
    a.calculation();
    a.print ("odd");
    int[][] arr = null;
    int[][] arr1 = null;
    int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int[] s = null;
    ArraysUtils array1 = new ArraysUtils(4,3);
    arr = array1.random();
    ArraysUtils array2 = new ArraysUtils(arr);
    System.out.println("Array: ");
    array2.print(arr);
    ArraysUtils array5 = new ArraysUtils(arr1);
    arr1 = array5.createSpiral(4, 4);
    System.out.println("Array is created: ");
    array5.print(arr1);
    if (array2.areEqual(arr, arr2) == true) {
      System.out.println("Arrays are the same");
    } else {
        System.out.println("Arrays aren't the same");
      }
    arr1 = array2.transpose(arr);
    ArraysUtils array4 = new ArraysUtils(arr1);
    System.out.println("Array is transposed: ");
    array4.print(arr1);
    s = array2.linearize(arr);
    ArraysUtils array3 = new ArraysUtils(s);
    System.out.println("Array is linearized: ");
    System.out.println(array3);
  }
}