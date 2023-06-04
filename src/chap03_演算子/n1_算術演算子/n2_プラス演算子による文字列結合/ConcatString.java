package chap03_演算子.n1_算術演算子.n2_プラス演算子による文字列結合;

public class ConcatString {

  public static void main(String[] args) {
    var result = "";
    for (var i = 0; i < 100000; i++) {
      result += "いろは";
    }
    // +演算子の場合、実行時間めっちゃ遅い。。（連結する度に新しいStringオブジェクトを生成しちゃうから）
  }
}
