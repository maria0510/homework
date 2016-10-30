package thirdpart;

class FieldDefaultValuesExample {

  public byte b;
  public short sh;
  public int i;
  public long l;
  public float f;
  public double d;
  public boolean bl;
  public char ch;

  public static void main(String[] args) {
    FieldDefaultValuesExample def = new FieldDefaultValuesExample();
    System.out.println(def.toString());
  }
  
  public String toString() {
    String str = b + " " + sh + " " + i + " " +
      + l + " " + f + " " + d + " " + bl + " " + ch;
      return str;
  }
}
