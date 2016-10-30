class BitwiseCal
{
  String binaryLeft;
  String binaryRight;
  String binary;

  public BitwiseCal(String binaryLeft, String binaryRight)
  {
    this.binaryLeft = binaryLeft;
    this.binaryRight = binaryRight;
  }

  public BitwiseCal(String binary)
  {
    this.binary = binary;
  }

  public String and(String binaryLeft, String binaryRight)
  {
    this.binaryLeft = binaryLeft;
    this.binaryRight = binaryRight;
    return bitwiseCalOfAND();
  }

  public String or(String binaryLeft, String binaryRight)
  {
    this.binaryLeft = binaryLeft;
    this.binaryRight = binaryRight;
    return bitwiseCalOfOR();
  }

  public String xor(String binaryLeft, String binaryRight)
  {
    this.binaryLeft = binaryLeft;
    this.binaryRight = binaryRight;
    return bitwiseCalOfXOR();
  }

  public String not(String binary)
  {
    this.binary = binary;
    return bitwiseCalOfNOT();
  }

  public String bitwiseCalOfAND()
  {
    StringBuilder ans = new StringBuilder();
    ans.append("");

    int i = binaryLeft.length()-1;
    int j = binaryRight.length()-1;
    int ch1 = (binaryLeft.length()-1)-i;
    int ch2 = (binaryRight.length()-1)-j;

    while(ch1 <= i)
    {
      int a = Integer.parseInt(binaryLeft.charAt(ch1) + "");
      int b = Integer.parseInt(binaryRight.charAt(ch2) + "");

      int result = a & b;

      ans.append("");
      ans.append(" " + a + " & " + b + " = " + result + "\n");

      ch1++;
      ch2++;

    }
    return ans.toString();
  }

  public String bitwiseCalOfOR()
  {
    StringBuilder ans = new StringBuilder();
    ans.append("");

    int i = binaryLeft.length()-1;
    int j = binaryRight.length()-1;
    int ch1 = (binaryLeft.length()-1)-i;
    int ch2 = (binaryRight.length()-1)-j;

    while(ch1 <= i)
    {
      int a = Integer.parseInt(binaryLeft.charAt(ch1) + "");
      int b = Integer.parseInt(binaryRight.charAt(ch2) + "");

      int result = a | b;

      ans.append("");
      ans.append(" " + a + " | " + b + " = " + result + "\n");

      ch1++;
      ch2++;
    }
    return ans.toString();
  }

  public String bitwiseCalOfXOR()
  {
    StringBuilder ans = new StringBuilder();
    ans.append("");

    int i = binaryLeft.length()-1;
    int j = binaryRight.length()-1;
    int ch1 = (binaryLeft.length()-1)-i;
    int ch2 = (binaryRight.length()-1)-j;

    while(ch1 <= i)
    {
      int a = Integer.parseInt(binaryLeft.charAt(ch1) + "");
      int b = Integer.parseInt(binaryRight.charAt(ch2) + "");

      int result = a ^ b;

      ans.append("");
      ans.append(" " + a + " ^ " + b + " = " + result + "\n");

      ch1++;
      ch2++;
    }
    return ans.toString();
  }

  public String bitwiseCalOfNOT()
  {
    StringBuilder ans = new StringBuilder();
    ans.append("");

    int i = binary.length()-1;
    int ch = (binary.length()-1)-i;

    while(ch <= i)
    {
      int a = Integer.parseInt(binary.charAt(ch) + "");

      int result = ~ a;

      ans.append("");
      ans.append( " ~ " + a + " = " + result + "\n");

      ch = ch + 1;
    }
    return ans.toString();
  }
}
