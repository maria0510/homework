package secondpart;

class BitwiseCalc {

  public static void main(String[] args) {
    String binary0 = "10101";
    String binary1 = "1100";
    String binary2 = "101";
    String binary3 = "1";
    String binary4 = "1001";
    String binary5 = "0111";
    String binary6 = "1100110";
    String binary7 = "101100";
    BitwiseCalc bcalc = new BitwiseCalc();
    System.out.println(binary0 + " & " + binary1 + " = " + bcalc.and(binary0, binary1));
    System.out.println(binary2 + " & " + binary3 + " = " + bcalc.and(binary2, binary3));
    System.out.println(binary4 + " & " + binary5 + " = " + bcalc.and(binary4, binary5));
    System.out.println(binary6 + " & " + binary7 + " = " + bcalc.and(binary6, binary7));
    System.out.println(binary0 + " | " + binary1 + " = " + bcalc.or(binary0, binary1));
    System.out.println(binary2 + " | " + binary3 + " = " + bcalc.or(binary2, binary3));
    System.out.println(binary4 + " | " + binary5 + " = " + bcalc.or(binary4, binary5));
    System.out.println(binary6 + " | " + binary7 + " = " + bcalc.or(binary6, binary7));
    System.out.println(binary0 + " ^ " + binary1 + " = " + bcalc.xor(binary0, binary1));
    System.out.println(binary2 + " ^ " + binary3 + " = " + bcalc.xor(binary2, binary3));
    System.out.println(binary4 + " ^ " + binary5 + " = " + bcalc.xor(binary4, binary5));
    System.out.println(binary6 + " ^ " + binary7 + " = " + bcalc.xor(binary6, binary7));
    System.out.println("~ " + binary0 + " = " + bcalc.not(binary0));
    System.out.println("~ " + binary1 + " = " + bcalc.not(binary1));
    System.out.println("~ " + binary2 + " = " + bcalc.not(binary2));
    System.out.println("~ " + binary3 + " = " + bcalc.not(binary3));
  }

  public String and(String binaryLeft, String binaryRight) {
    String result = "";
    int x, y;
    int maxlength = getMaxStringLength(binaryLeft, binaryRight);
    int a = compareStringsLength(binaryLeft, binaryRight);
    if (a > 0) {
        binaryRight = changeStringLengthToEqual(a, binaryRight);
    } else {
        binaryLeft = changeStringLengthToEqual(-a, binaryLeft);
    }
    for (int i = 0; i < maxlength; i++) {
      x = Character.getNumericValue(binaryLeft.charAt(i));
      y = Character.getNumericValue(binaryRight.charAt(i));
      result += x & y;
    }
    return result;
  }

  public String or(String binaryLeft, String binaryRight) {
    String result = "";
    int x, y;
    int maxlength = getMaxStringLength(binaryLeft, binaryRight);
    int a = compareStringsLength(binaryLeft, binaryRight);
    if (a > 0) {
        binaryRight = changeStringLengthToEqual(a, binaryRight);
    } else {
        binaryLeft = changeStringLengthToEqual(-a, binaryLeft);
    }
    for (int i = 0; i < maxlength; i++) {
      x = Character.getNumericValue(binaryLeft.charAt(i));
      y = Character.getNumericValue(binaryRight.charAt(i));
      result += x | y;
    }
    return result;
  }

  public String xor(String binaryLeft, String binaryRight) {
    String result = "";
    int x, y;
    int maxlength = getMaxStringLength(binaryLeft, binaryRight);
    int a = compareStringsLength(binaryLeft, binaryRight);
    if (a > 0) {
        binaryRight = changeStringLengthToEqual(a, binaryRight);
    } else {
        binaryLeft = changeStringLengthToEqual(-a, binaryLeft);
    }
    for (int i = 0; i < maxlength; i++) {
      x = Character.getNumericValue(binaryLeft.charAt(i));
      y = Character.getNumericValue(binaryRight.charAt(i));
      result += x ^ y;
    }
    return result;
  }

  public String not(String binary) {
    String result = "";
    for (int i = 0; i < binary.length(); i++) {
      result += (binary.charAt(i) == '0') ? 1:0;
    }
    return result;
  }

  public static int getMaxStringLength(String binaryLeft, String binaryRight) {
    return (binaryLeft.length() > binaryRight.length()) ? binaryLeft.length() : binaryRight.length();
  }

  public static int compareStringsLength(String binaryLeft, String binaryRight) {
    int a = binaryLeft.length() - binaryRight.length();
    return a;
  }

  public static String changeStringLengthToEqual(int a, String binary) {
    for (int i = 0; i < a; i++) {
      binary = "0" + binary;
    }
    return binary;
  }

}
