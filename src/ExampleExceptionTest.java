import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {3, 2, 6},
                {10, 10, 100}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-5, -5},
                {-10, 10}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {

        assertEquals(ExampleException.rectangleArea(a, b), c, "Wrong Area");
    }

    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        try {
            ExampleException.rectangleArea(a, b);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "Please enter only positive numbers");
        }
    }
}
