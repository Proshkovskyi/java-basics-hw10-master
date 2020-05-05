public class ExampleException {
  public static int rectangleArea(int a, int b) {

    int c = a * b;

    if (c < 0) {
      throw new IllegalArgumentException("Please enter only positive numbers");
    }
    return c;
  }
}







