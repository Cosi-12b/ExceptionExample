public class CheckedClass {

  public void doesntCompile() {
//    alwaysThrows();
  }

  public void useCatch() {
    try {
      alwaysThrows();
    } catch (Exception e) {
      System.out.println("Bummer: " + e);
    }
    System.out.println("I continue happily!");
    
  }

  public void useThrows() throws MyException {
    alwaysThrows(); 
  }
  
  private void alwaysThrows() throws MyException {
    throw new MyException("Ha ha");
  }

}
