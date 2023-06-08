package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n1_ラムダ式を利用しない例;

public class MethodRefUnuseBasic {

  public static void main(String[] args) {
    // 文字列配列dataの内容を順に出力
    var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
    var un = new MethodRefUnuse();
    un.walkArray(data);
  }
  // 実行結果：
  // [春はあけぼの]
  // [夏は夜]
  // [秋は夕暮れ]
}
