package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class p01_Home_Page
{
     WebDriver driver;
    WebDriverWait wait= new WebDriverWait(driver, 10);

    //1-constructor
    public p01_Home_Page(WebDriver driver)
    {
        this.driver=driver;
    }
    //2-locators
    //Explicit time
    WebElement shadowHost=driver.findElement(By.id("contentContainer"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    WebElement shadowRoot=(WebElement) js.executeScript("return argument[0].shadowRoot",shadowHost);
    WebElement ladies_Outerwear=shadowRoot.findElement(By.cssSelector("a[href='list/ladies_outerwear']"));


   // WebElement top_container=driver.findElement(By.id("contentContainer"));
   // WebElement ladies_Outerwear=top_container.findElement(By.cssSelector("a[href='/list/ladies_outerwear']"));

    //3-methods
    public p02_Ladies_Outerwear click_Ladies_Outerwear()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ladies_Outerwear));
        ladies_Outerwear.click();
        return new p02_Ladies_Outerwear(driver);

    }


}
