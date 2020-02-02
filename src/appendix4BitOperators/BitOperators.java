package appendix4BitOperators;

public class BitOperators {
  public static void main(String[] args) {
    BitOperators operators = new BitOperators();
    operators.andOrXorSample();
    operators.notSample();
    operators.shiftSample();
    operators.shiftRightSample();
    operators.shiftUnsignedRightSample();
    operators.simpleBitOperators();
  }

  public void printValue(String variableName, int number) {
    System.out.print(variableName + ":");
    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(number);
    for (int i = 0; i < numberOfLeadingZeros; i++) {
      System.out.print("0");
    }
    if (Integer.SIZE == numberOfLeadingZeros) {
      System.out.println("\t[" + number + "]");
    } else {
      System.out.println(Integer.toBinaryString(number) + "\t[" + number + "]");
    }
  }

  public void andOrXorSample() {
    int a = 1, b = 7;
    andOperation(a, b);
    orOperation(a, b);
    xorOperation(a, b);

    a = 1;
    b = 3;
    andOperation(a, b);
    orOperation(a, b);
    xorOperation(a, b);

    a = -10;
    b = 10;
    andOperation(a, b);
    orOperation(a, b);
    xorOperation(a, b);
  }

  public void andOperation(int a, int b) {
    int result = a & b;
    printValue("    a ", a);
    printValue("    b ", b);
    printValue("a & b ", result);
    System.out.println();
  }

  public void orOperation(int a, int b) {
    int result = a | b;
    printValue("    a ", a);
    printValue("    b ", b);
    printValue("a | b ", result);
    System.out.println();
  }

  public void xorOperation(int a, int b) {
    int result = a ^ b;
    printValue("    a ", a);
    printValue("    b ", b);
    printValue("a ^ b ", result);
    System.out.println();
  }

  public void notSample() {
    int a = 1;
    notOperation(a);
    a = 255;
    notOperation(a);
    a = -10;
    notOperation(a);
    a = 0;
    notOperation(a);
  }

  public void notOperation(int a) {
    int result = ~a;
    printValue("    a ", a);
    printValue("   ~a ", result);
    System.out.println();
  }

  public void shiftSample() {
    int a = 1;
    for (int i = 1; i < 34; i++) {
      a = shiftLeft(a, 1);
    }
  }

  public int shiftLeft(int a, int move) {
    int result = a << move;
    printValue("     a ", a);
    printValue("a << " + move + " ", result);
    System.out.println();
    return result;
  }

  public void shiftRightSample() {
    int a = 2147483647;
    for (int i = 1; i < 34; i++) {
      a = shiftRight(a, 1);
    }

    a = -2147483647;
    for (int i = 1; i < 34; i++) {
      a = shiftRight(a, 1);
    }
  }

  public int shiftRight(int a, int move) {
    int result = a >> move;
    printValue("     a ", a);
    printValue("a >> " + move + " ", result);
    System.out.println();
    return result;
  }

  public void shiftUnsignedRightSample() {
    int a = -2147483647;
    for (int i = 1; i < 34; i++) {
      a = shiftUnsignedRight(a, 1);
    }
  }

  public int shiftUnsignedRight(int a, int move) {
    int result = a >>> move;
    printValue("      a ", a);
    printValue("a >>> " + move + " ", result);
    System.out.println();
    return result;
  }

  public void simpleBitOperators() {
    int a = 1;
    int b = 7;
    printValue("     a ", a);
    printValue("     b ", b);
    b &= a;
    printValue("b &= a ", b);
    b = 7;
    b |= a;
    printValue("b |= a ", b);
    b = 7;
    b ^= a;
    printValue("b ^= a ", b);
    b = 7;
    b <<= a;
    printValue("b <<= a ", b);
    b = 7;
    b >>= a;
    printValue("b >>= a ", b);
    b = 7;
    b >>>= a;
    printValue("b >>>= a ", b);
  }
}
