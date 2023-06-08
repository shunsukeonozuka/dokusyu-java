package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n3_ラムダ式の基本;

public class MethodLambdaBasic {

  public static void main(String[] args) {
    var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
    var ml = new MethodLambda();
    ml.walkArray(
      data,
      (String value) -> {
        System.out.printf("[%s]\n", value);
      }
    );
  }
}
