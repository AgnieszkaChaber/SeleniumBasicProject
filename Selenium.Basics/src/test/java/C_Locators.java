import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Locators {

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }


    @Test
    public void findById(){
        WebDriver driver = getDriver();
        WebElement firstNameField = driver.findElement(By.id("firstname-text"));
        WebElement selectDayList = driver.findElement(By.id("day-select"));
        driver.quit();
    }

    @Test
    public void findByName(){
        WebDriver driver = getDriver();
        WebElement lastNameField = driver.findElement(By.name("your-lastname"));
        WebElement selectAnimalList = driver.findElement(By.name("animal"));
        driver.quit();
    }

    @Test
    public void findByClassName(){
        WebDriver driver = getDriver();
        WebElement movieField = driver.findElement(By.className("movie"));
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));
        driver.quit();
    }

    @Test
    public void findByTagName(){
        WebDriver driver = getDriver();
        WebElement headerArea = driver.findElement(By.tagName("header"));
        WebElement footerArea = driver.findElement(By.tagName("footer"));
        driver.quit();
    }

    @Test
    public void findByCssSelector(){
        WebDriver driver = getDriver();

        // finding element using CSS Selector and ID
        WebElement optionsRadioButtons = driver.findElement(By.cssSelector("#option-radio"));

        // finding elements using CSS Selector and class name
        WebElement numbersRadioButtons = driver.findElement(By.cssSelector("span[class='wpcf7-form-control wpcf7-radio number']"));
        WebElement numbersRadioButtons2  = driver.findElement(By.cssSelector(".number"));

        // finding element using CSS Selector and URL
        WebElement  policyLink= driver.findElement(By.cssSelector("a[href='https://programautomatycy.pl/privacy-policy/'"));
        WebElement coursesLink = driver.findElement(By.cssSelector("a[href='https://programautomatycy.pl/courses/'"));

        driver.quit();
    }

    @Test
    public void findByXPath() throws InterruptedException{
        WebDriver driver = getDriver();

        WebElement headerArea = driver.findElement(By.tagName("header"));
        WebElement footerArea = driver.findElement(By.tagName("footer"));
        driver.quit();
    }
}
