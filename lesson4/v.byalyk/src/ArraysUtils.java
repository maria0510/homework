class ArraysUtils {
    public static boolean areEqual(int[][] arr1, int[][] arr2) {
        if(arr1.length != arr2.length)
            return  false;
        for(int i = 0 ; i < arr1.length ; i++ ){
            if(arr1[i].length != arr2[i].length)
                return  false;
            for(int j = 0 ; j < arr1[i].length ;j++ ){
                if( arr1[i][j] != arr2[i][j] )
                    return false;
            }
        }
        return true;
    }
    public static int[] linearize(int[][] arr) {
        int len =  0;
        for(int i = 0 , t = 0 ; i < arr.length ; i++){
            len += arr[i].length;
        }

        int[] tempArr = new int[len];
        for(int i = 0 , t = 0 ; i < arr.length ; i++){
          for(int j = 0 ; j < arr[i].length ; j++){
              tempArr[t] = arr[i][j];
              t++;
          }

      }
        return tempArr;
    }
    public static String printArr(int[] mas){
        String str = "[";
        for(int j = 0 ; j < mas.length ; j++){
            if(j == mas.length - 1)
                str +=  mas[j];
            else
             str +=  mas[j] + ", " ;
        }
        return  str + "]";
    }

      public static int[][] createSpiral(int n, int m) {
          int[][] csArr = new int[n][m];
          int gStart = 0, gEnd = n, vStart = 0, vEnd = m, numStart = 0, numEnd = n * m;
          int rightF = n, bottomF = m, leftF = 0, topF = 1;
          String move = "right";
          for( int i = 1 ; i <= numEnd ; i++){
              csArr[gStart][vStart] = i;
              switch (move){
                  case "right":
                      vStart++;
                      if(vStart == rightF){
                          rightF--;
                          move = "bottom";
                          gStart++;
                          vStart--;
                      }
                     break;
                  case "bottom":
                      gStart++;
                      if(gStart == bottomF){
                          bottomF--;
                          move = "left";
                          gStart--;
                          vStart--;
                      }
                      break;
                  case "left":
                      vStart--;
                      if(vStart == leftF){
                          leftF++;
                          move = "top";
                     }
                      break;
                  case "top":
                      gStart--;
                      if(gStart == leftF){
                          topF++;
                          move = "right";
                      }
                      break;

              }
          }

          return csArr;
    }

    public static int[][] transpose(int[][] arr) {
       int[][] tArr = new int[arr[0].length][arr.length];
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

}
