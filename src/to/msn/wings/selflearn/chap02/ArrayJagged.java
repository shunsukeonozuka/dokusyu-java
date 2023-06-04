package to.msn.wings.selflearn.chap02;

public class ArrayJagged {

  public static void main(String[] args) {
    // 要素数の異なる多次元配列に初期値を設定
    var list = new int[][] { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println(list[1][2]);
    // >5
  }
}
