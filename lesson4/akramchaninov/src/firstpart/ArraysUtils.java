package firstpart;

class ArraysUtils {

  public static void main(String[] args) {
    int[][] arr1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
    int[][] arr2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
    int[][] arr3 = {{1,2,3,4}, {5,6,7,8}};
    int[][] arr4 = {{1,2,3,4}, {5,6,7}, {9,10,11,12}}; //subarray's length differs
    int[][] arr5 = {{1,2,3,4}, {5,6,7,8}, {9,11,11,12}}; //one element differs from arr1

    print(arr1);
    print(arr2);
    print(arr3);
    print(arr4);
    print(arr5);

    System.out.println("Arrays equality");
    System.out.print("Array 1 and array 2 - ");
    areEqual(arr1, arr2);
    System.out.print("Array 1 and array 3 - ");
    areEqual(arr1, arr3);
    System.out.print("Array 1 and array 4 - ");
    areEqual(arr1, arr4);
    System.out.print("Array 1 and array 5 - ");
    areEqual(arr1, arr5);
    System.out.println();

    System.out.println("Linearization");
    print(linearize(arr1));
    System.out.println();

    System.out.println("Spiral");
    print(createSpiral(4,5));
    System.out.println();

    System.out.println("Transposition");
    print(arr1);
    print(transpose(arr1));

  }

  public static boolean areEqual(int[][] arr1, int[][] arr2) {
    if (compareArraysElements(arr1, arr2)) {
      System.out.println("are equal");
      return true;
    } else {
      System.out.println("are not equal");
      return false;
    }
  }

  public static int[] linearize(int[][] arr) {
    int[] a = new int[count2DArrayElements(arr)];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        a[index] = arr[i][j];
        index++;
      }
    }
    return a;
  }

  public static int[][] createSpiral(int n, int m) {
    int[][] arr = new int[n][m];
    int count = 1;
    int step = 0;
    while (count <= n * m) {
      for(int j = step; j < (m - step); j++) {
        arr[step][j] = count;
        count++;
      }
      for(int i = (step + 1); i < (n - step); i++) {
        arr[i][m - step - 1] = count;
        count++;
      }
      for (int j = (m - step - 2); j >= step; j--) {
        arr[n - step - 1][j] = count;
        count++;
      }
      for(int i = (n - step - 2); i > step; i--) {
        arr[i][step] = count;
        count++;
      }
      step++;
    }
    return arr;
  }

  public static int[][] transpose(int[][] arr) {
    int[][] transposed = new int[arr[arr.length-1].length][arr.length];
    for (int i = 0; i < arr[arr.length-1].length; i++) {
      for (int j = 0; j < arr.length; j++) {
        transposed[i][j] = arr[j][i];
      }
    }
    return transposed;
  }

  public static void print(int[][] arr) {
    for(int i = 0; i < arr.length; i++) {
      print(arr[i]);
    }
    System.out.println();
  }

  public static void print(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    System.out.println();
  }

  private static boolean compareArraysDimensions(int[][] a, int[][] b) {
    boolean bl = false;
    if (a.length == b.length) {
      for (int i = 0; i < a.length; i++) {
        if (a[i].length == b[i].length) {
          bl = true;
        } else {
          bl = false;
          break;
        }
      }
    } else bl = false;
    return bl;
  }

  private static boolean compareArraysElements(int[][] a, int[][] b) {
    boolean bl = false;
    if (compareArraysDimensions(a, b)) {
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
          if (a[i][j] == b[i][j]) {
            bl = true;
          } else {
            bl = false;
            break;
          }
        }
      }
    }
    return bl;
  }

  private static int count2DArrayElements(int[][] a) {
    int quantity = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        quantity++;
      }
    }
    return quantity;
  }

}
