import java.util.Arrays;
class BitwiseCalc {
  public static void main(String[] args) {
    BitwiseCalcClass calc = new BitwiseCalcClass();
    System.out.println(calc.and("001100", "01101"));
    System.out.println(calc.and("101100", "01001"));
    System.out.println(calc.and("001100", "001000"));

    System.out.println();

    System.out.println(calc.or("001100", "01101"));
    System.out.println(calc.or("101100", "01001"));
    System.out.println(calc.or("001100", "001000"));

    System.out.println();

    System.out.println(calc.xor("001100", "01101"));
    System.out.println(calc.xor("101100", "01001"));
    System.out.println(calc.xor("001100", "001000"));

    System.out.println();

    System.out.println(calc.not("001100"));
    System.out.println(calc.not("100000"));
    System.out.println(calc.not("00001"));
  }
}
class BitwiseCalcClass {

  public String and (String binaryLeft, String binaryRight){
    String result = "";
    String max = maxString(binaryLeft,binaryRight);
    String min = minString(binaryLeft, binaryRight);
    int diff = differenceOfLength(binaryLeft,binaryRight);
    for (int i = maxSize(binaryRight, binaryLeft)-1; i >= diff ;i-- ) {
      if (max.charAt(i) == '1' && min.charAt(i - diff) == '1'){
        result += "1";
      }
      else{
        result += "0";
      }
    }
    return revertString(result);
  }

  public String or (String binaryLeft, String binaryRight){
    String result = "";
    String max = maxString(binaryLeft,binaryRight);
    String min = minString(binaryLeft, binaryRight);
    int diff = differenceOfLength(binaryLeft,binaryRight);
    for (int i = maxSize(binaryRight, binaryLeft)-1; i >= diff ;i-- ) {
      if (max.charAt(i) == '1' || min.charAt(i - diff) == '1'){
        result += "1";
      }
      else{
        result += "0";
      }
    }
    return revertString(result);
  }


  public String xor (String binaryLeft, String binaryRight){
    String result = "";
    String max = maxString(binaryLeft,binaryRight);
    String min = minString(binaryLeft, binaryRight);
    int diff = differenceOfLength(binaryLeft,binaryRight);
    for (int i = maxSize(binaryRight, binaryLeft)-1; i >= diff ;i-- ) {
      if (max.charAt(i) == '1' ^ min.charAt(i - diff) == '1'){
        result += "1";
      }
      else{
        result += "0";
      }
    }
    return revertString(result);
  }

  public String not (String binary){
    String result = "";
    for (int i = 0; i < binary.length(); i++ ) {
      result += (binary.charAt(i) == '1') ? 0 : 1;
    }
    return result;
  }


  private int minSize (String firstString, String secondString){
    return (firstString.length() >= secondString.length()) ? secondString.length() : firstString.length();
  }
  private int maxSize (String firstString, String secondString){
    return (firstString.length() < secondString.length()) ? secondString.length() : firstString.length();
  }

  private String minString (String firstString, String secondString){
    return (firstString.length() >= secondString.length()) ? secondString : firstString;
  }
  private String maxString (String firstString, String secondString){
    return (firstString.length() < secondString.length()) ? secondString : firstString;
  }

  private int differenceOfLength(String firstString, String secondString){
    return (int)Math.abs(firstString.length() - secondString.length());
  }
  private String revertString (String string){
    String result = "";
    for(int i = string.length() - 1; i >=0; i--){
      result += string.charAt(i);
    }
    return result;
  }
}
