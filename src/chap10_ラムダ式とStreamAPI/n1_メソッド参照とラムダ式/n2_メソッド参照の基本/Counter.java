package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n2_メソッド参照の基本;

// 文字列長をカウントするためのCounterクラス
public class Counter {

  private int result = 0;

  public int getResult() {
    return this.result;
  }

  public void addLength(String value) {
    this.result += value.length();
  }
}
