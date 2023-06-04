package chap03_演算子.n3_関係演算子.n2_浮動小数点数の比較;

public class CompareFloat {

  public static void main(String[] args) {
    System.out.println(0.2 * 3 == 0.6); //>false
    // 2進数で演算されるため異なる結果に。。
    // やっぱりBigDecimalを使う
  }
}
