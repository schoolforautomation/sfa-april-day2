import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Config {

    @BeforeSuite
    public void init() {
        System.out.println("Before");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("After");
    }
}
