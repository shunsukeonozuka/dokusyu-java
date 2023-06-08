package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n1_ラムダ式を利用しない例;

public class MethodRefUnuse {

  // 文字列配列の内容をブラケット付きで出力
  public void walkArray(String[] data) {
    for (var value : data) {
      System.out.printf("[%s]\n", value);
    }
  }
}
