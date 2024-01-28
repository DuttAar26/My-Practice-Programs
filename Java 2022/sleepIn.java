public class sleepIn {
  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    } else {
      return false;
    }
  }
}
