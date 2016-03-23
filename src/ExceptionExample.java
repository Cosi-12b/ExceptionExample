public class ExceptionExample {

  public static void main(String[] args) {
    example1();
    example2();
    example3();
    try {
      example4();
    } catch (MyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private static void example1() {
    System.out.println("Example1");
    try {
      int a[] = new int[2];
      a[31] = 99; // ILLEGAL!
      System.out.println("Line after invalid access");
    } catch (Exception x) {
      System.out.println("*** Exception thrown  :" + x);
    }
    System.out.println("*** Out of the block");
  }

  private static void example2() {
    System.out.println("\nExample2");
    FailClass fc = new FailClass();
    String val = fc.getWithErrorSentry(20);
    if (val != null) {
      System.out.println("Value Retrieved is " + val);
    } else
      System.out.println("*** Unable to retrieve a value");
  }

  private static void example3() {
    System.out.println("\nExample3");
    FailClass fc = new FailClass();
    try {
      String val = fc.getWithException(2);
    } catch (Exception e) {
      System.out.println("*** Failed to retrieve " + e);
    } finally {
      System.out.println("After catch...");
    }
  }
  
  private static void example4() throws MyException {
    System.out.println("\nExample 4");
    CheckedClass cc = new CheckedClass();
    cc.doesntCompile();
    cc.useCatch();
    cc.useThrows();
  }

}