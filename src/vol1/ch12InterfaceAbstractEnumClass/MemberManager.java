package vol1.ch12InterfaceAbstractEnumClass;

public class MemberManager implements MemberManagerInterface {
  @Override
  public boolean addMember(MemberDTO member) {
    return false;
  }

  @Override
  public boolean removeMember(MemberDTO member) {
    return false;
  }

  @Override
  public boolean updateMember(MemberDTO member) {
    return false;
  }
}
