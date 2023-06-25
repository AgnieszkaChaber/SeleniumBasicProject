import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class F_CheckElements {

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void elementExist(){
        WebDriver driver = getDriver();
        System.out.println("---------------------------");

        List<WebElement> descriptionTextAreaById = driver.findElements(By.id("description-text"));
        if (descriptionTextAreaById.size() > 0) {
            System.out.println("Text area exist");
        } else {
            System.out.println("Text area doesn't exist");
        }
        System.out.println("---------------------------");


        List<WebElement> fakeTextAreaById = driver.findElements(By.id("dqwert"));
        if (fakeTextAreaById.size() > 0) {
            System.out.println("Fake text area exist");
        } else {
            System.out.println("Fake text area doesn't exist");
        }

        driver.quit();
    }

    @Test
    public void elementIsEnabled(){
        WebDriver driver = getDriver();

        WebElement firstNameFieldById = driver.findElement(By.id("firstname-text"));
        System.out.println("First name input is enabled: " + firstNameFieldById.isEnabled());

        WebElement lastNameFieldById = driver.findElement(By.id("lastname-text"));
        System.out.println("Last name input is enabled: " + lastNameFieldById.isEnabled());

        WebElement disabledTextFieldById = driver.findElement(By.id("disabled-text"));
        System.out.println("Text input is enabled: " + disabledTextFieldById.isEnabled());

        driver.quit();
    }

    @Test
    public void elementIsDisplayed() throws InterruptedException{
        WebDriver driver = getDriver();

        WebElement delayedButton = driver.findElement(By.id("delay-button"));
        System.out.println("Button is displayed: " + delayedButton.isDisplayed());
        Thread.sleep(2000);
        System.out.println("After 2 more seconds button is displayed: " + delayedButton.isDisplayed());

        WebElement doNothingButton = driver.findElement(By.id("nothing-submit"));
        System.out.println("'Do nothing' button is displayed: " + doNothingButton.isDisplayed());

        driver.quit();
    }

    @Test
    public void elementIsSelected() {
        WebDriver driver = getDriver();
        driver.findElement(By.id("cn-accept-cookie")).click();

        WebElement animalDropBoxByXpath = driver.findElement(By.xpath("//*[@id='animal-select']")).findElement(By.xpath("//*[@value='Chomik']"));
        animalDropBoxByXpath.click();
        System.out.println("Is selected 'chomik'? " + animalDropBoxByXpath.isSelected());

        WebElement noPolicyRadioButtonByXpath = driver.findElement(By.xpath("//*[@id='wpcf7-f9259-p9257-o1']//input[@value='Nie']"));
        noPolicyRadioButtonByXpath.click();
        System.out.println("Is selected 'nie'? " +  noPolicyRadioButtonByXpath.isSelected());

        WebElement yesPolicyRadioButtonByXpath = driver.findElement(By.xpath("//*[@id='wpcf7-f9259-p9257-o1']//input[@value='Tak']"));
        System.out.println("Is selected 'tak'? " +  yesPolicyRadioButtonByXpath.isSelected());

        driver.quit();
    }

}
