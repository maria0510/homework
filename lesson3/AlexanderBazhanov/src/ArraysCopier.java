import java.util.Arrays;
class ArraysCopier{
  public static void main(String[] args) {
    int[] one  = {1,2,3,4,5,6,7,8,9};
    ArraysCopierClass example  = new ArraysCopierClass(one);

    System.out.println (Arrays.toString(example.copyOf(16)));
    System.out.println (Arrays.toString(example.copyOfRange(2,5)));
    System.out.println (Arrays.toString(example.fill(7)));
  }
}
class ArraysCopierClass{
  int[] array;
  public ArraysCopierClass(int[] array){
    this.array = array;
  }
  public int[] copyOf(int newLength){
    if (newLength <= 0) return null;
    int[] copy = new int[newLength];
    if (array.length >= newLength) {
      for (int i = 0; i < copy.length; i++) {
        copy[i] = array[i];
      }
    }
    else {
      for (int i = 0; i < array.length; i++) {
        copy[i] = array[i];
      }
    }
    return copy;
  }
  public int[] copyOfRange(int from, int to){
    if (to < from || to > array.length || from == to || from < 0) return null;
    int diff = to - from;
    int[] copy = new int[diff];
    for (int i = 0, j = from; i < diff; i++, j++) {
      copy[i] = array[j];
    }
    return copy;
  }
  public int[] fill(int value){
    int[] result = new int[array.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = value;
    }
    return result;
  }
}
