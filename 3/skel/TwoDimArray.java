/** skeleton file for
 class twoDimArray
  ...practice working with 2D arrays
*/
public class TwoDimArray
{
  //print each row of 2D integer array a on its own line,
  // using a FOR loop
  public static void print1( int[][] a ) {
	for(int i = 0; i < a.length; i++)
	{
		for(int j = 0; j < a[i].length; j++)
		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
  }
  //print each row of 2D integer array a on its own line,
  // using a FOREACH loop
  public static void print2( int[][] a ) {
	for(int[] arr1d: a)
	{
		for(int elem: arr1d)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
	}
  }
  //return sum of all items in 2D integer array a
  public static int sum1( int[][] a ) {
	return 0;
  }
  //return sum of all items in 2D integer array a
  // using helper fxn sumRow
  public static int sum2( int [][] m ) {
	return 0;
  }
  //return sum of all items on row r of 2D integer array a
  // using a FOR loop
  public static int sumRow( int r, int[][] a ) {
	return 0;
  }
  //return sum of all items on row r of 2D integer array a
  // using a FOREACH loop
  public static int sumRow2( int r, int[][] m ) {
	return 0;
  }
  public static void main( String [] args )
  {
       int [][] m1 = new int[4][2];
       int [][] m2 = { {2,4,6}, {3,5,7} };
       int [][] m3 = { {2}, {4,6}, {1,3,5} };
       print1(m1);
       print1(m2);
       print1(m3);
       print2(m1);
       print2(m2);
       print2(m3);
	   /* ~~~v~~~~~slide~me~down~as~you~test~~~~~~~~~~~~~~~v~~~
       System.out.print("testing sum1...\n");
       System.out.println("sum m1 : " + sum1(m1));
       System.out.println("sum m2 : " + sum1(m2));
       System.out.println("sum m3 : " + sum1(m3));
       System.out.print("testing sum2...\n");
       System.out.println("sum m1 : " + sum2(m1));
       System.out.println("sum m2 : " + sum2(m2));
       System.out.println("sum m3 : " + sum2(m3));
       ~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~*/
  }//end main()
}//end class TwoDimArray