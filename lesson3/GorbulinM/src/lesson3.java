import java.util.Arrays;

class lesson3
{
  public static void main(String[] args)
  {

    BitwiseCal bitwisecal1 = new BitwiseCal("0011", "0101");
    BitwiseCal bitwisecal2 = new BitwiseCal("013");

    System.out.println("\n" + " and : " + "\n" + bitwisecal1.bitwiseCalOfAND());
    System.out.println(" or : " + "\n" + bitwisecal1.bitwiseCalOfOR());
    System.out.println(" xor : " + "\n" + bitwisecal1.bitwiseCalOfXOR());
    System.out.println(" not : " + "\n" + bitwisecal2.bitwiseCalOfNOT());


    FieldDefaultValuesExample convert = new FieldDefaultValuesExample(12, 3.14d, 12312546l, 0.362f, 's', (short)64, (byte)10, true);

    System.out.println(" ConverToString : " + "\n" + convert.toString());

    int[] inA = new int[] {1, 2, 3, 4};
    ArraysCopier masiv = new ArraysCopier(inA);

    System.out.println(" copyOf" + "\n" + " v1 : " + Arrays.toString(masiv.copyOf(5)) + "\n"
          + " v2 : " + Arrays.toString(masiv.copyOf(2)) + "\n"
          + " v3 : " + Arrays.toString(masiv.copyOf(0)) + "\n"
          + " v4 : " + Arrays.toString(masiv.copyOf(-1)));

    System.out.println("\n" + " copyOfRange" + "\n" + " v1 : " + Arrays.toString(masiv.copyOfRange(0, 2)) + "\n"
         + " v2 : " + Arrays.toString(masiv.copyOfRange(1, 0)) + "\n"
         + " v3 : " + Arrays.toString(masiv.copyOfRange(3, 3)));

    System.out.println("\n" + " fill" + "\n" + " v1 : " + Arrays.toString(masiv.fill(5)) + "\n"
          + " v2 : " + Arrays.toString(masiv.fill(2)) + "\n"
          + " v3 : " + Arrays.toString(masiv.fill(0)) + "\n"
          + " v4 : " + Arrays.toString(masiv.fill(-1)));
  }
}
