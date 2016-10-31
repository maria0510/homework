class FieldDefaultValuesExample{
  public static void main(String[] args) {
    FieldDefaultValues instance = new FieldDefaultValues();
    System.out.print(instance.toString());
  }


}
class FieldDefaultValues{
  byte byteS;
  short shortS;
  int intS;
  long longS;
  float floatS;
  double doubleS;
  char charS;
  boolean booleanS;

  public String toString(){
    String result = "byte = " + byteS + "\n" +
                    "short = " + shortS + "\n" +
                    "int = " + intS + "\n" +
                    "long = " + longS + "\n" +
                    "float = " + floatS + "\n" +
                    "double = " + doubleS + "\n" +
                    "char = " + charS + "\n" +
                    "boolean = " + booleanS + "\n";
    return result;
  }

}
