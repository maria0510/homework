package lesson3.secondprogram;

class BitwiseCalc{
  public static void main(String[] args) {
    String a = "00001111";
		String c = "00101010";
    String b = new String();
		b = and(a, c);
    System.out.println("Bitwise operator &: " + b);

    String b1 = new String();
    b1 = or(a, c);
		System.out.println("Bitwise operator |: " + b1);

		String b2 = new String();
		b2 = xor(a, c);
		System.out.println("Bitwise operator ^: " + b2);

		String b3 = new String();
		b3 = not(c);
		System.out.println("Bitwise operator ~: " + b3);
  }

	public static String and(String binaryLeft, String binaryRight){
	  int i = Integer.parseInt(binaryRight, 2) & Integer.parseInt(binaryLeft, 2);
		return  Integer.toBinaryString(i);
	}

  public static String or(String binaryLeft, String binaryRight){
	  int i = Integer.parseInt(binaryRight, 2) | Integer.parseInt(binaryLeft, 2);
		return  Integer.toBinaryString(i);
	}

  public static String xor(String binaryLeft, String binaryRight){
	  int i = Integer.parseInt(binaryRight, 2) ^ Integer.parseInt(binaryLeft, 2);
		return  Integer.toBinaryString(i);
	}

  public static String not(String binary){
	  int i = ~ Integer.parseInt(binary, 2);
		return  Integer.toBinaryString(i);
	}
}