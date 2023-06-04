package chap03_演算子.n2_代入演算子.n1_基本型と参照型による代入;

public class Substitution {

  public static void main(String[] args) {
    var x = 1;
    var y = x;
    x += 10;
    System.out.println(x); //>11
    System.out.println(y); //>1
    // 基本型は値をコピー

    var builder1 = new StringBuilder("あいう");
    var builder2 = builder1;
    builder1.append("えお");
    System.out.println(builder1.toString()); //>あいうえお
    System.out.println(builder2.toString()); //>あいうえお
    // 参照型はアドレスコピー
  }
}
