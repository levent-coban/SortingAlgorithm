public class Sorting {
  
  public static void main(String[] args) {
  
    
    int[] x = { 3, 2, 5, 4, 1 };
    
    
    for ( int a = 0; a < x.length; a++ ) {
      for ( int b = a + 1; b < x.length; b++ ) {
        if( x[a] > x[b] ){
          int temp = x[a];
          x[a] = x[b];
          x[b] = temp;
        }
      }
    }
    
    
    System.out.println();
    
    for ( int i = 0; i < x.length; i++ ) {
      System.out.print( x[i] + " " );
    }
    
    
  }
