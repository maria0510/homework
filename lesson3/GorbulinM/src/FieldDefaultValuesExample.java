class FieldDefaultValuesExample
{
  int a1;
  double a2;
  long a3;
  float a4;
  char a5;
  short a6;
  byte a7;
  boolean a8;

  public FieldDefaultValuesExample(int a1, double a2, long a3, float a4, char a5, short a6, byte a7, boolean a8) //short and byte can not work =(
  {
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
    this.a4 = a4;
    this.a5 = a5;
    this.a6 = a6;
    this.a7 = a7;
    this.a8 = a8;
  }

  public String toString()
  {
    String intToString = Integer.toString(a1);
    String doubleToString = Double.toString(a2);
    String longToString = Long.toString(a3);
    String floatToString = Float.toString(a4);
    String charToString = new String(new char[] {a5});
    String booleanToString = Boolean.toString(a8);
    String byteToString = Byte.toString(a7);
    String shortToString = Short.toString(a6);

    return  + "\n" + doubleToString + "\n" + intToString + "\n"
           + longToString + "\n" + shortToString + "\n"
           + byteToString + "\n" + booleanToString + "\n"
           + charToString + "\n" + floatToString + "\n";
  }
}
