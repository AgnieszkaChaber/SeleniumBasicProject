import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class D_Interactions {
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void driverInteractions(){
        WebDriver driver = getDriver();
        System.out.println("---------------------------");

        // page URL
        System.out.println(driver.getCurrentUrl());
        System.out.println("---------------------------");

        // page or card tittle
        System.out.println(driver.getTitle());
        System.out.println("---------------------------");

        // page source
        System.out.println(driver.getPageSource());
        System.out.println("---------------------------");

        driver.quit();
    }

    @Test
    public void sendingKeysIntoElement(){
        WebDriver driver = getDriver();
        WebElement firstNameFieldById = driver.findElement(By.id("firstname-text"));
        firstNameFieldById.sendKeys("John");
        firstNameFieldById.clear();
        firstNameFieldById.sendKeys("Marc");
        firstNameFieldById.sendKeys(Keys.TAB + "Smith");
        driver.findElement(By.id("description-text")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        driver.quit();
    }

    @Test
    public void clickingOnElement(){
        WebDriver driver = getDriver();

        // clicking on button
        driver.findElement(By.id("cn-accept-cookie")).click();
        WebElement doNothingButton = driver.findElement(By.id("nothing-submit"));
        doNothingButton.click();

        //clicking on radio button
        WebElement numberRadioButtonsByXpath = driver.findElement(By.xpath("//input[@value='6']"));
        numberRadioButtonsByXpath.click();
        WebElement privacyPolicyRadioButtonByXpath = driver.findElement(By.xpath("//*[@id='wpcf7-f9259-p9257-o1']//input[@value='Nie']"));
        privacyPolicyRadioButtonByXpath.click();

        //selecting option from dropdown list
        WebElement animalDropBoxByXpath = driver.findElement(By.xpath("//*[@id='animal-select']")).findElement(By.xpath("//*[@value='Chomik']"));
        animalDropBoxByXpath.click();

        // clicking on option from select list
        WebElement colourSelectOptionByXpath = driver.findElement(By.xpath("//*[@id='colour-select-multiple']")).findElement(By.xpath("//*[@value='Czarny']"));
        colourSelectOptionByXpath.click();

        // clicking on checkboxes
        List<WebElement> cLettersCheckBoxByXpath = driver.findElements(By.xpath("//input[@type='checkbox' and (@value='P' or @value='C')]"));
        for (int i = 0; i < cLettersCheckBoxByXpath.size(); i++){
            cLettersCheckBoxByXpath.get(i).click();
        }
        WebElement groupCheckBoxByXpath = driver.findElement(By.xpath("//*[@id='group-checkbox']/span[2]/input"));
        groupCheckBoxByXpath.click();


        // clicking on link
        WebElement linkByXpath = driver.findElement(By.xpath("//*[text()='kursy']"));
        linkByXpath.click();
        driver.navigate().back();

        driver.quit();
    }
}
