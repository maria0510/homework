package firstpart;

class PascalsTriangle {
  public int[][] triangle;

  public PascalsTriangle(int n) {
    triangle = initPascalTriangle(n);
  }

  public static void main(String[] args) {
    PascalsTriangle pt = new PascalsTriangle(5);
    pt.print();
    pt.print("EVEN");
    pt.print("ODD");
  }


  public void print() {
    for(int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        System.out.print(triangle[i][j]);
      }
      System.out.println();
    }
  }

  public void print(String filter) {
    if (filter == "EVEN") {
      for (int i = 0; i < triangle.length; i++) {
        for (int j = 0; j < triangle[i].length; j++) {
          if (triangle[i][j] % 2 == 1) {
            System.out.print("*");
          } else {
            System.out.print(triangle[i][j]);
          }
        }
        System.out.println();
      }
    }
    if (filter == "ODD") {
      for (int i = 0; i < triangle.length; i++) {
        for (int j = 0; j < triangle[i].length; j++) {
          if (triangle[i][j] % 2 == 0) {
            System.out.print("*");
          } else {
            System.out.print(triangle[i][j]);
          }
        }
        System.out.println();
      }
    }
  }

  private static int[][] initPascalTriangle(int n) {
    int[][] arr = new int[n][];
    for(int i = 0; i < n; i++) {
      arr[i] = new int[i + 1];
      for (int j = 0; j < (i + 1); j++) {
        if (j == 0 || j == i) {
          arr[i][j] = 1;
        }
        else {
          arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
        }
      }
    }
    return arr;
  }

}
