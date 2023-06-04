package chap03_演算子.n3_関係演算子.n2_浮動小数点数の比較;

import java.math.BigDecimal;

public class CompareBigDecimal {

  public static void main(String[] args) {
    var bd1 = new BigDecimal("0.2");
    var bd2 = new BigDecimal("3");
    var bd3 = new BigDecimal("0.6");
    System.out.println(bd1.multiply(bd2).compareTo(bd3)); //>0
    // 等しい場合は0を返す
  }
}
