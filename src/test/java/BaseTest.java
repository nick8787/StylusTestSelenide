import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import utils.Constants;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = Constants.BROWSER;
        Configuration.browserSize = Constants.BROWSER_SIZE;
        Configuration.timeout = Duration.ofSeconds(20).toMillis();
        open(Constants.BASE_URL);
    }
}