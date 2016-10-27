class PascalTriangle {
    public int[][] PascalTriangleArray;

    public PascalTriangle(int ptHeight){
        PascalTriangleArray = new int[ptHeight][];
        int colNumber = 1;

        for( int i = 0 ; i < ptHeight ; i++){
            PascalTriangleArray[i] = new int[colNumber];
            for( int j = 0 ; j < colNumber ; j++){

                if(j == 0 || j == colNumber -1){
                    PascalTriangleArray[i][j] = 1;
                }
                else{
                    PascalTriangleArray[i][j] = PascalTriangleArray[i - 1][j - 1] +  PascalTriangleArray[i - 1][j];
                }
            }
            colNumber++;
        }

    }

    public void print(){
        for( int i = 0 ; i < PascalTriangleArray.length ; i++){
            for( int j = 0 ; j < PascalTriangleArray[i].length ; j++){
                System.out.print( PascalTriangleArray[i][j]);
                System.out.print( " ");
            }
            System.out.println("");
        }
    }
    public void print(String filter){ //"EVEN" или "ODD"
        for( int i = 0 ; i < PascalTriangleArray.length ; i++){
            for( int j = 0 ; j < PascalTriangleArray[i].length ; j++){
                if(filter == "EVEN"){
                    if(PascalTriangleArray[i][j] % 2 == 0)
                            System.out.print("#");
                    else
                        System.out.print( PascalTriangleArray[i][j]);
                }
                if(filter == "ODD"){
                    if(PascalTriangleArray[i][j] % 2 == 1)
                        System.out.print("@");
                    else
                        System.out.print( PascalTriangleArray[i][j]);
                }
                if(filter == "EVEN-ODD"){
                    if(PascalTriangleArray[i][j] % 2 == 1)
                        System.out.print("@");
                    else
                        System.out.print("#");
                }

                System.out.print(" ");

            }
            System.out.println("");
        }
    }
 /*   public static int[][] transpose(int[][] arr) {
       int[][] tArr = new int[arr[0].length][arr.length];
        System.out.println( arr.length + " - " + arr[0].length);
       for(int i = 0 ; i < arr.length ; i++){
           for(int j = 0 ; j< arr[i].length ; j++){
              tArr[j][i] = arr[i][j];
           }
       }
       return tArr;
    }

 public static void print(int[][] arr) {
     String str = "[";
     for(int i = 0 ; i < arr.length ; i++) {
         if(i == 0)
            str += printArr(arr[i]) + "\n";
         else if(i == arr.length - 1)
             str += " " + printArr(arr[i]);
         else
             str += " " + printArr(arr[i]) + "\n";
     }
     str += "]";
     System.out.println(str);
    }
*/
}
