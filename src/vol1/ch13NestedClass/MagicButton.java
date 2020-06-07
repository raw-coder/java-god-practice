package vol1.ch13NestedClass;

public class MagicButton {
  public MagicButton() {
  }

  private EventListener listener;

  public void setEventListener(EventListener listener) {
    this.listener = listener;
  }

  public void onClickProcess() {
    if (listener != null) {
      listener.onClick();
    }
  }
}
