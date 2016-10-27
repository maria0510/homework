class Main {
  public static void main(String ... args) {
    ArraysUtils mArrays = new ArraysUtils ();
    int[][] mA1 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
   int[][] mA2 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    System.out.println( mArrays.areEqual(mA1, mA2) );
      int[] lineArizeArrey =  mArrays.linearize(mA1)  ;
      System.out.println(  mArrays.printArr( lineArizeArrey ) );
      mArrays.print(mA1);
      mArrays.print( mArrays.createSpiral( 2 , 2 ) );
      System.out.println( "transpose" );
      int[][] mA3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 8, 10}};
      mArrays.print( mA3  );
      mArrays.print( mArrays.transpose( mA3 ) );

      PascalTriangle PascalTriangleNew = new PascalTriangle(30);
      PascalTriangleNew.print();
      //"EVEN" или "ODD"
      PascalTriangleNew.print("EVEN");
      PascalTriangleNew.print("ODD");
      PascalTriangleNew.print("EVEN-ODD");

  }
}
