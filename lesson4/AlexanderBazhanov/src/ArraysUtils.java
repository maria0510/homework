import java.util.Arrays;
class ArraysUtils{
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[][] array2 = {{6,7,8,9,10}, {1,2,3,4,5}};
        int[][] array3 = {{1,2,3,4,5}, {6,7,8,9,10}};

        System.out.println(areEqual(array1, array2));
        System.out.println(areEqual(array1, array3));

        System.out.println(Arrays.toString(linearize(array1)));

        print(array1);
        System.out.println();
        print(transpose(array1));
        System.out.println();
        print(createSpiral(4,4));
    }

    public static boolean areEqual(int[][] arr1, int[][] arr2){
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] linearize(int[][] arr){
        int[] newArray = new int[totalLength(arr)];
        for (int i = 0, k = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, k++) {
                newArray[k] = arr[i][j];
            }
        }
        return newArray;
    }

    public static int[][] createSpiral(int n, int m){
        int[][] array =  new int[n][m];
        int num = 1;
        int linePos = 0;
        int columnPos = 0;
        int firstLine = 0;
        int lastLine = n - 1;
        int firstColumn = 0;
        int lastColumn = m - 1;
        while (num < (n * m + 1)){
            if (linePos < lastColumn) {
                for (linePos = firstColumn; linePos <= lastColumn; linePos++, num++){
                    array[firstLine][linePos] = num;
                }
                firstLine++;
                for (columnPos = firstLine; columnPos <= lastLine; columnPos++, num++ ) {
                    array[columnPos][lastColumn] = num;
                }
                lastColumn--;
            }
            else {
                for (linePos = lastColumn; linePos >= firstColumn; linePos--, num++){
                    array[lastLine][linePos] = num;
                }
                lastLine--;
                for (columnPos = lastLine; columnPos >= firstLine; columnPos--, num++) {
                    array[columnPos][firstColumn] = num;
                }
                firstColumn++;
            }
        }
        return array;

    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }

    public static int totalLength(int[][] arr){
        return arr.length * arr[0].length;
    }
}
