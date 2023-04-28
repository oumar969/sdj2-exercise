import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        int result = calculator.add(-2, -3);
        Assert.assertEquals(-5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdditionWithNull() {
        calculator.add(2, null);
    }

}