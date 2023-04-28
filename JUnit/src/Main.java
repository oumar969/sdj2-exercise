import org.junit.platform.commons.util.PackageUtils;
import org.testng.annotations.Test;
import org.junit.*;

public class Main {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        Assert.assertEquals(5, result);
    }
}