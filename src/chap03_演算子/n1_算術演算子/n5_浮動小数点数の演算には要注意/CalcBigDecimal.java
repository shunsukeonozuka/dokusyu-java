package chap03_演算子.n1_算術演算子.n5_浮動小数点数の演算には要注意;

import java.math.BigDecimal;

public class CalcBigDecimal {

  public static void main(String[] args) {
    var bd1 = new BigDecimal("0.7");
    var bd2 = new BigDecimal("0.1");
    var bd3 = new BigDecimal("10");

    System.out.println(bd1.add(bd2).multiply(bd3)); //>8.0
    // 正しくできた！
  }
}
