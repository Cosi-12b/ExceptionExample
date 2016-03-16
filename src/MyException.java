/*
 * Custom Checked Exception "MyException"
 */
public class MyException extends Exception {
  String extraMessage;
  MyException(String s) {
    extraMessage = s;
  }
}
