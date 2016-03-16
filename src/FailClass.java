
public class FailClass {
  String[] strings = {"One", "Two", "Three"};

  public String getWithErrorSentry(int i) {
    if (i >= 0 && i < strings.length)
      return strings[i];
    else
      return null;
  }
  
  public String getWithException(int i) {
    if (i >= 0 && i < strings.length)
      return strings[i];
    else
      throw new IllegalArgumentException("Bad value of index: " + i);
  }
}
