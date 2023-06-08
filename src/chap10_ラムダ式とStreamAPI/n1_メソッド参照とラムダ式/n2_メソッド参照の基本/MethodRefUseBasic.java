package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n2_メソッド参照の基本;

public class MethodRefUseBasic {

  public static void main(String[] args) {
    var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
    var un = new MethodRefUse();
    un.walkArray(data, MethodRefUse::addQuote);
  }
}
