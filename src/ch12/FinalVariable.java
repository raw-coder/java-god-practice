package ch12;

public class FinalVariable {
  final int instanceVariable = 1;  // final 변수는 생성하면서 값을 초기화

  public void method(final int parameter) {
    final int localVariable;
    localVariable = 2;
    // localVariable = 3; // final local 변수는 생성이후 반드시 초기화를 할 필요는 없으나 재할당은 불가
    // parameter = 4; // final parameter 는 재할당 불가
  }
}
