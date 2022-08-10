import java.lang.Math;
class fibonacci{
  public static Integer NthFibonacci(Integer n){
    double fi = 1.618034;
    int fb = (int) Math.round((Math.pow(fi,n) - Math.pow(1-fi,n))/Math.sqrt(5));
    return fb;
  }

  public static void FibonacciSeries(Integer n){
    for(int i = 0; i < n; i++){
      System.out.print(NthFibonacci(i) + " ");
    }
  }  
  public static void main(String[] args) {
    FibonacciSeries(10);
  }
}
