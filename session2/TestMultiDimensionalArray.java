package session2;

public class TestMultiDimensionalArray {

    // main function
  public static void main(String args[])
  {
      // declaring and initializing 2D array
      int arr[][] = { { 2, 7, 9 }, { 3, 6, 1, 12 }, { 7, 4, 2, 13, 15 } };
      
      System.out.println(arr.length + " is the array total length ");
      
      int arrayLen = arr.length;

      // printing 2D array
      for (int i = 0; i < arrayLen; i++) {
    	  
    	  int subArrayLen = arr[i].length;
    	  // System.out.println(arr[0].length + " is the sub array length at index: " + i);
    	  
          for (int j = 0; j < subArrayLen; j++)
              System.out.print(arr[i][j] + " ");

          System.out.println();
      }
  }
  
  // returning array from a method:
  public static int[] m1()
  {
      // returning  array
      return new int[] { 1, 2, 3 };
  }
  
}
