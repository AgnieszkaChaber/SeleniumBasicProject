import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A_Drivers {

    public WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }


    public WebDriver edgeDriver(){
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;
    }


}
