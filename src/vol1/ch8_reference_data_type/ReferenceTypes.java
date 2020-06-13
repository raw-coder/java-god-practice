package vol1.ch8_reference_data_type;

public class ReferenceTypes {
  public ReferenceTypes() {
  }

  public ReferenceTypes(String data) {
  }

  public static void main(String[] args) {
    ReferenceTypes referenceTypes = new ReferenceTypes();
    MemberDTO.staticMethod();
    referenceTypes.checkMemberDTOName();

    referenceTypes.makeStaticBlockObject();

    referenceTypes.callPassByValue();

    referenceTypes.calculateNumbers(1);
    referenceTypes.calculateNumbers(1, 2);
    referenceTypes.calculateNumbers(1, 2, 3);
    referenceTypes.calculateNumbers(1, 2, 3, 4);
    referenceTypes.calculateNumbers(1, 2, 3, 4, 5);
  }

  public void makeMemberObject() {
    MemberDTO memberDTO1 = new MemberDTO();
    MemberDTO memberDTO2 = new MemberDTO("Steve");
    MemberDTO memberDTO3 = new MemberDTO("Steve", "010-123-4567");
    MemberDTO memberDTO4 = new MemberDTO("Steve", "010-123-4567", "hello@hello.com");
  }

  // method overloading
  public void print() {

  }

  public void print(String data) {

  }

  public void print(int intData, String stringData) {

  }

  public void print(String stringData, int intData) {

  }

  public int intReturn() {
    int returnInt = 0;
    return returnInt;
//    returnInt++; // unreachable statement
  }

  public int[] intArrayReturn() {
    int[] returnArray = new int[10];
    return returnArray;
  }

  public String returnString() {
    String string = "Return Value";
    return string;
  }

  public void wantToStopInTheMiddle(boolean flag) {
    // ...
    if (flag) return;
    // ...
  }

  public void checkMemberDTOName() {
    MemberDTO dto1 = new MemberDTO("Steve");
    System.out.println(dto1.name);
    MemberDTO dto2 = new MemberDTO("Ann");
    System.out.println(dto1.name);
  }

  public void makeStaticBlockObject() {
    System.out.println("===makeStaticBlockObject===");

    System.out.println("data = " + StaticBlock.getData());
    System.out.println("Creating block1");
    StaticBlock block1 = new StaticBlock();
    System.out.println("Created block1");

    System.out.println("Creating block2");
    StaticBlock block2 = new StaticBlock();
    System.out.println("Created block2");
    System.out.println("data = " + StaticBlock.getData());
  }

  public void callPassByValue() {
    int a = 10;
    String b = "b";
    MemberDTO member = new MemberDTO("Steve");

    this.passByValue(a, b, member);

    System.out.println("callPassByValue method result");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("member.name = " + member.name);
  }

  public void passByValue(int a, String b, MemberDTO member) {
    a = 20;
    b = "z";
//    member = new MemberDTO("Ann");
    member.name = "Ann";

    System.out.println("passByValue method result");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("member.name = " + member.name);
  }

  public void calculateNumbers(int... numbers) {
    System.out.println("===calculateNumbers===");
    int total = 0;
    for (int number : numbers) {
      total += number;
    }
    System.out.println("Total = " + total);
  }
}
