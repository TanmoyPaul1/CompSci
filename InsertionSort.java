public class InsertionSort{
  public static void sort(double[] a)
  {
    for (int n = 1; n < a.length; n++)
    {
      double x = a[n];
      int i = n;
      while (i > 0 && x < a[i-1])
      {
        a[i] = a[i-1];
        i--;
      }
      a[i] = x;
    }
  }
}


