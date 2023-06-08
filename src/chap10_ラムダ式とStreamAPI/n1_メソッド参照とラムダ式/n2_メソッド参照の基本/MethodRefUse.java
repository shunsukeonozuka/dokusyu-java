package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n2_メソッド参照の基本;

public class MethodRefUse {

  // 配列要素の処理方法をメソッド参照で受け取れるように
  public void walkArray(String[] data, Output output) {
    for (var value : data) {
      output.print(value);
    }
  }

  // Output型に対応したメソッド（渡された文字列をブラケットでくくる）
  static void addQuote(String value) {
    System.out.printf("[%s]\n", value);
  }
}
