package ch11ObjectClass;

public class MemberDTO {
  //public static String name; // static 을 붙이면 모든 객체에서 같은 값을 참조하게 됨
  public String name;
  public String phone;
  public String email;

  /**
   * 아무정보도 모를때
   */
  public MemberDTO() {
  }

  /**
   * 이름만 알떼
   *
   * @param name
   */
  public MemberDTO(String name) {
    this.name = name;
  }

  /**
   * 이름과 전화번호만 알 떼
   *
   * @param name
   * @param phone
   */
  public MemberDTO(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  /**
   * 모든 정보를 알 때
   *
   * @param name
   * @param phone
   * @param email
   */
  public MemberDTO(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  public static void staticMethod() {
    System.out.println("This is a static method!");
//    System.out.println(name);
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    MemberDTO other = (MemberDTO) obj;

    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;

    if (email == null) {
      if (other.email != null) return false;
    } else if (!email.equals(other.email)) return false;

    if (phone == null) {
      if (other.phone != null) return false;
    } else if (!phone.equals(other.phone)) return false;

    return true;
  }

  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (name == null ? 0 : name.hashCode());
    result = prime * result + (email == null ? 0 : email.hashCode());
    result = prime * result + (phone == null ? 0 : phone.hashCode());
    return result;
  }
}
