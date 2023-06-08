package chap10_ラムダ式とStreamAPI.n1_メソッド参照とラムダ式.n3_ラムダ式の基本;

import java.util.function.Consumer;

public class MethodLambda {

  public void walkArray(String[] data, Consumer<String> output) {
    for (var value : data) {
      output.accept(value);
    }
  }
}
