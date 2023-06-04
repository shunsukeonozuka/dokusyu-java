package chap03_演算子.n1_算術演算子.n4_除算とデータ型;

public class DivZero {

  public static void main(String[] args) {
    System.out.println(5 / 0); //>エラー：Exception in thread "main" java.lang.ArithmeticException: / by zero
    System.out.println(5 % 0); //>エラー：Exception in thread "main" java.lang.ArithmeticException: / by zero
    System.out.println(5d / 0); //>Infinity
    System.out.println(5d % 0); //>NaN
    // オペランドが整数の場合、ゼロ除算はエラー、浮動小数点数の場合、無限（Infinity）か非数（NaN）となる
  }
}
