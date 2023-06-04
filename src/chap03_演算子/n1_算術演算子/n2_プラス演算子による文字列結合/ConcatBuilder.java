package chap03_演算子.n1_算術演算子.n2_プラス演算子による文字列結合;

public class ConcatBuilder {

  public static void main(String[] args) {
    var builder = new StringBuilder();
    for (var i = 0; i < 100000; i++) {
      builder.append("いろは");
    }
    // StringBuilderを使えば一瞬で終わる（再生成せずに文字列サイズを拡張してくれるから）
  }
}
