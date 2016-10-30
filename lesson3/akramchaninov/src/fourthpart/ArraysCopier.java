package fourthpart;

import java.util.Arrays;

class ArraysCopier {

  public int[] a;

  public ArraysCopier(int[] a) {
    this.a = a;
  }

  public static void main(String[] args) {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = i + 1;
    }
    System.out.println("Original array");
    System.out.println(Arrays.toString(a));

    ArraysCopier arrcop = new ArraysCopier(a);

    System.out.println("Copy of original array with new length");
    int[] b1 = arrcop.copyOf(7);
    int[] b2 = arrcop.copyOf(3);
    int[] b3 = arrcop.copyOf(12);
    System.out.println(Arrays.toString(b1));
    System.out.println(Arrays.toString(b2));
    System.out.println(Arrays.toString(b3));

    System.out.println("Copy of original array between two elements");
    int[] c1 = arrcop.copyOfRange(3, 7);
    int[] c2 = arrcop.copyOfRange(4, 11);
    int[] c3 = arrcop.copyOfRange(5, 8);
    System.out.println(Arrays.toString(c1));
    System.out.println(Arrays.toString(c2));
    System.out.println(Arrays.toString(c3));

    System.out.println("Fills each elenent of an array with a new value");
    int[] d1 = arrcop.fill(1);
    int[] d2 = arrcop.fill(0);
    int[] d3 = arrcop.fill(5);
    System.out.println(Arrays.toString(d1));
    System.out.println(Arrays.toString(d2));
    System.out.println(Arrays.toString(d3));
  }

  public int[] copyOf(int newLength) {
    int[] b = new int[newLength];
    if (newLength > a.length) {
      b = null;
    } else {
      for (int i = 0; i < newLength; i++) {
        b[i] = a[i];
      }
    }
    return b;
  }

  public int[] copyOfRange(int from, int to) {
    int[] c = new int[to - from + 1];
    if (from > a.length || to > a.length) {
      c = null;
    } else {
      int j = from;
      for (int i = 0; i <= (to - from); i++) {
        c[i] = a[j - 1];
        j++;
      }
    }
    return c;
  }

  public int[] fill(int value) {
    int[] d = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      d[i] = value;
    }
    return d;
  }

}
