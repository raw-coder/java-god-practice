package vol1.ch12_interface_abstract_enum;

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
