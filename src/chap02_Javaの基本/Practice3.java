package chap02_Javaの基本;

public class Practice3 {

  public static void main(String[] args) {
    final double DISCOUNT = 0.9;
    var price = 500;
    var sum = price * DISCOUNT;

    System.out.println((int) sum);
    // >450
  }
}
