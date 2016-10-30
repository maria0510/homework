import java.util.Arrays;

class ArraysCopier
{
  int[] a;

  public ArraysCopier(int[] a)
  {
    this.a = a;
  }

  public int[] copyOf(int newLength)
  {
    if (newLength < 0)
    return null;

    int[] b = new int[newLength];

    for (int i = 0; i < newLength; i++)
    {
      if (i == a.length) break;
      b[i] = this.a[i];
    }
    return b;
   }

   public int[] copyOfRange(int from, int to)
   {
     if (from < 0 || to > a.length || to < from)
     return null;

     int dlin = to - from + 1;
     int[] b = new int[dlin];

     for (int i = 0; i < b.length; i++)
     {
       b[i] = this.a[from];
       from++;
     }
     return b;
   }

   public int[] fill(int value)
   {
     int dlin = this.a.length;
     int[] b = new int[dlin];

     for (int i = 0; i < dlin; i++)
     {
       b[i] = value;
     }
     return b;
   }
 }
