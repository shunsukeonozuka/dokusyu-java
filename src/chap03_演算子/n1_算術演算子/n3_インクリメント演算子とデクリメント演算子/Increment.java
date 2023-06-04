package chap03_演算子.n1_算術演算子.n3_インクリメント演算子とデクリメント演算子;

public class Increment {

  public static void main(String[] args) {
    var i = 3;
    var j = ++i;
    System.out.println(i); //>4
    System.out.println(j); //>4

    var m = 3;
    var n = m++;
    System.out.println(m); //>4
    System.out.println(n); //>3
  }
}
