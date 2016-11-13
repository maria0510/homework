package main.java;

public class ArraysUtils{
  public static int[][] array = null;
  public static int n;
  public static int m;
  public static int[] k = null;
	
  public ArraysUtils(int[] k){
    this.k = k;
  }
  public ArraysUtils(int[][] array){
    this.array = array;
  }
  public ArraysUtils(int n, int m){
    this.n = n;
    this.m = m;
    array = new int[m][n];
  }
  public String toString() {
    String w = " ";
    for (int i = 0; i < k.length; i++) {
      w += Integer.toString(k[i]) + " ";
    }
    return w;
  }
  public int[][] random(){
    int r = 0;
    for(int k = 0; k < m; k++){
      for(int a = 0; a < n; a++){
        array[k][a] = r + 1;
	r++;
      }	
    }
    return array;
  } 
  public static boolean areEqual(int[][] arr1, int[][] arr2) {
    int g = 0;
      for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
	  if (arr1[i][j] == arr2[i][j]) {
	    g++;
	  }
	}
      }
      if(g == (n * m)) {
        return true;
      } else {
          return false;
	}
  }
  public static int[] linearize(int[][] arr) {
    int y = 0;
    k = new int[n * m];
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        k[y] = arr[i][j]; 
	  y++;
      }
    }
    return k;
  }
  public static int[][] createSpiral(int n, int m) {
    int i = 0;
    int j = 0;
    int a = 0;
    int b = 0;
    int t = n * m;
    boolean k = false;
    int[][] createarray = new int [n][m];
    createarray[j][i] = 1;
    while(k != true) {
      for (i = a + 1; i < m - a; i++) {
        createarray[b][i] = createarray[b][i - 1] + 1;
      }
      for (j = b + 1; j < n - b; j++) {
	createarray[j][m - 1 - a] = createarray[j - 1][m - 1 - a] + 1;
      }
      for (i = m - 2 - a; i >= a; i--) {
	createarray[n - 1 - b][i] = createarray[n - 1 - b][i + 1] + 1;
      }
      for (j = n - 2 - b; j >= b + 1; j--) {
	createarray[j][a] = createarray[j + 1][a] + 1;
	createarray[j][a + 1] = createarray[j][a] + 1;
      }
      for (j = 0; j < createarray.length; j++) {
        for (i = 0; i < createarray[j].length; i++){
	  if (createarray[j][i] == t - 1) {
	    k = true;
	  }
	  if (createarray[j][i] == 0 && k == true) {
	    createarray[j][i] = t; 
	  }
	}
      }
      a++;
      b++;
    }
    return createarray;
  }
  public static int[][] transpose(int[][] arr) {
    int[][] tran = new int [n][m];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
	tran[i][j] = arr[j][i];
      }
    }
    return tran;
  }
  public static void print(int [][] arr) {
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
	System.out.print(" " + arr[i][j]);
      }
      System.out.println();
    }
  }
}	
	
