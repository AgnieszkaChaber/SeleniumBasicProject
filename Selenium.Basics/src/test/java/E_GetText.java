import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_GetText {
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void getTextFromElement(){
        WebDriver driver = getDriver();
        driver.findElement(By.id("cn-accept-cookie")).click();

        // getting text from attribute
        WebElement firstNameFieldById = driver.findElement(By.id("firstname-text"));
        firstNameFieldById.sendKeys("John");
        System.out.println("---------------------------");
        System.out.println("First name (value): " + firstNameFieldById.getAttribute("value"));

        WebElement dayDropBoxByXpath = driver.findElement(By.xpath("//*[@id='day-select']/option[4]"));
        System.out.println("---------------------------");
        System.out.println("Dzień tygodnia (getText): " + dayDropBoxByXpath.getText());
        System.out.println("Dzień tygodnia (innerText): " + dayDropBoxByXpath.getAttribute("innerText"));

        driver.quit();

    }

}
