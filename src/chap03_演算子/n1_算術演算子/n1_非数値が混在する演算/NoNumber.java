package chap03_演算子.n1_算術演算子.n1_非数値が混在する演算;

import java.time.LocalDateTime;

public class NoNumber {

  public static void main(String[] args) {
    System.out.println(1 + 2);
    // >3

    System.out.println("a" + 5);
    // >a5

    System.out.println(5 + "b");
    // >5b

    System.out.println("1" + "2");
    // >12

    System.out.println("a" + LocalDateTime.now());
    // >a2023-06-04T15:10:58.419745200

    // System.out.println(1 + LocalDateTime.now());
    // >エラー：The operator + is undefined for the argument type(s) int, LocalDateTime
  }
}
