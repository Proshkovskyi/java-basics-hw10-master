public class ExampleException {
  public static int rectangleArea(int a, int b) {

    int c = a * b;

    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Please enter only positive numbers");
    } else {
      return c;
    }
  }
}







