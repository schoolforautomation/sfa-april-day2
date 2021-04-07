import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test() {
        System.out.println("Is 2 equal to 3?");
        Assert.assertEquals(2, 3);
    }

}
