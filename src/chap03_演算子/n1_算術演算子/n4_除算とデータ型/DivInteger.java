package chap03_演算子.n1_算術演算子.n4_除算とデータ型;

public class DivInteger {

  public static void main(String[] args) {
    System.out.println(3 / 4); //>0
    // オペランド（ここで言う3とか4）が整数の場合、演算結果も整数になってしまう、ので結果が0になる

    double result = 3 / 4;
    System.out.println(result); //>0.0
    // double型に入れても同じ（演算のタイミングで整数化されてるから）

    System.out.println(3d / 4); //>0.75
    // オペランドを明示的にdouble型にすればok
  }
}
