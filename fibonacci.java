import java.lang.Math;

class fibonacci{
  public static long NthFibonacci(int n){
    double a = (1/Math.sqrt(5))*Math.pow(2, n);
   
    double radians1 = Math.toRadians(36.0);
    double radians2 = Math.toRadians(108.0);
    
    double b = Math.pow(Math.cos(radians1), n) - Math.pow(Math.cos(radians2), n);

    long fb = (long) Math.round(a*b);
    return fb;
  }

  public static void FibonacciSeries(int n){
    for(int i = 0; i < n; i++){
      System.out.println( i + " : " +  NthFibonacci(i));
    }
  }  
  public static void main(String[] args) {
    FibonacciSeries(1000);
  }
}
