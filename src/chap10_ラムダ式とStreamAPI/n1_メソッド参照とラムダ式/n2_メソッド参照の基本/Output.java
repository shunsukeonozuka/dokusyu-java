package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n2_メソッド参照の基本;

// String型の引数を受け取り、戻り値はvoidであるメソッド型
@FunctionalInterface
public interface Output {
  void print(String str);
}
