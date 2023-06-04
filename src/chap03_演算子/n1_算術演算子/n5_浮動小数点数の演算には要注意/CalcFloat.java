package chap03_演算子.n1_算術演算子.n5_浮動小数点数の演算には要注意;

public class CalcFloat {

  public static void main(String[] args) {
    System.out.println(Math.floor((0.7 + 0.1) * 10)); //>7.0
    // 8のはずなのに、、（浮動小数点数が2進数で演算されることによる誤差が発生してしまう）
    // この場合はBigDecimalを使う
  }
}
