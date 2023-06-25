import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Navigation {

    @Test
    public void navigation(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //window size
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(800, 800));

        //page navigation
        driver.navigate().to("https://www.programautomatycy.pl");
        driver.navigate().to("https://programautomatycy.pl/contact/");
        driver.navigate().back();
        driver.navigate().refresh();

        driver.quit();
    }
}
