import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Assertions {

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void assertions(){
        WebDriver driver = getDriver();

        // assert true/false
        WebElement movieFieldByID= driver.findElement(By.id("movie-text"));
        Assert.assertTrue(movieFieldByID.isEnabled());

        WebElement groupCheckBoxByXpath = driver.findElement(By.xpath("//*[@id='group-checkbox']/span[2]/input"));
        Assert.assertFalse(groupCheckBoxByXpath.isSelected());

        // assert equal values
        WebElement bookFieldById = driver.findElement(By.id("book-text"));
        bookFieldById.sendKeys("Hobbit");
        Assert.assertEquals("Hobbit", bookFieldById.getAttribute("value"));

        // assert not null value
        WebElement disabledTextFieldById = driver.findElement(By.id("disabled-text"));
        Assert.assertNotNull(disabledTextFieldById .getAttribute("disabled"));

        driver.quit();
    }

}
