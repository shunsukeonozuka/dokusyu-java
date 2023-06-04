package chap03_演算子.n3_関係演算子.n1_同一性と同値性;

public class CompareStringBuilder {

  public static void main(String[] args) {
    var builder1 = new StringBuilder("あいう");
    var builder2 = new StringBuilder("あいう");

    System.out.println(builder1 == builder2); //>false
    // ==は同一性の比較だからfalse（アドレスが異なるため）

    System.out.println(builder1.toString().equals(builder2.toString())); //>true
    // equalsメソッドを使うことで同値性の比較ができる
  }
}
