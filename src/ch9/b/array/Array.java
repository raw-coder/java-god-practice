package ch9.b.array;

public class Array {
  static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

  public static void main(String[] args) {
    Array array = new Array();
    array.init();
    array.primitiveTypes();
    array.referencesTypes();
    array.printArrayLength();

    if (args.length > 0) {
      for (String arg : args) {
        System.out.println(arg);
      }
    }
  }

  public void init() {
    int[] lottoNumbers = new int[7];
    lottoNumbers[0] = 5;
    lottoNumbers[1] = 12;
    lottoNumbers[2] = 23;
    lottoNumbers[3] = 25;
    lottoNumbers[4] = 38;
    lottoNumbers[5] = 41;
    lottoNumbers[6] = 2;
//    lottoNumbers[7] = 9;
  }

  public void primitiveTypes() {
    byte[] byteArray = new byte[1];
    short[] shortArray = new short[1];
    int[] intArray = new int[1];
    long[] longArray = new long[1];
    float[] floatArray = new float[1];
    double[] doubleArray = new double[1];
    char[] charArray = new char[1];
    boolean[] booleanArray = new boolean[1];

    System.out.println("byteArray[0] = " + byteArray[0]);
    System.out.println("shortArray[0] = " + shortArray[0]);
    System.out.println("intArray[0] = " + intArray[0]);
    System.out.println("longArray[0] = " + longArray[0]);
    System.out.println("floatArray[0] = " + floatArray[0]);
    System.out.println("doubleArray[0] = " + doubleArray[0]);
    System.out.println("charArray[0] = [" + charArray[0] + "]");
    System.out.println("booleanArray[0] = " + booleanArray[0]);

    System.out.println("byteArray = " + byteArray);
    System.out.println("shortArray = " + shortArray);
    System.out.println("intArray = " + intArray);
    System.out.println("longArray = " + longArray);
    System.out.println("floatArray = " + floatArray);
    System.out.println("doubleArray = " + doubleArray);
    System.out.println("charArray = " + charArray);
    System.out.println("booleanArray = " + booleanArray);
  }

  public void referencesTypes() {
    System.out.println("===referencesTypes===");

    String[] strings = new String[2];
    Array[] array = new Array[2];
    strings[0] = "God of Java";
    array[0] = new Array();

    System.out.println("strings[0] = " + strings[0]);
    System.out.println("strings[0] = " + strings[1]);
    System.out.println("array[0] = " + array[0]);
    System.out.println("array[0] = " + array[1]);

    System.out.println("strings = " + strings);
    System.out.println("array = " + array);
  }

  public void otherInit() {
    int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
  }

  public void twoDimensionalArray() {
    int[][] twoDim = new int[2][3];

    int[][] twoDim2 = new int[2][];
    twoDim2[0] = new int[3];
    twoDim2[1] = new int[2];

    int[][] twoDim3 = {{1, 2, 3}, {4, 5, 6}};
  }

  public void printArrayLength() {
    System.out.println("===printArrayLength===");

    int monthLength = months.length;
    System.out.println("month.length = " + monthLength);

    int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
    System.out.println("twoDim.length = " + twoDim.length);
    System.out.println("twoDim[0].length = " + twoDim[0].length);

    for (int i = 0; i < twoDim.length; i++) {
      for (int j = 0; j < twoDim[i].length; j++) {
        System.out.println("twoDim[" + i + "][" + j + "] = " + twoDim[i][j]);
      }
    }

    for (int[] tempArray : twoDim) {
      for (int temp : tempArray) {
        System.out.println(temp);
      }
    }
  }
}
