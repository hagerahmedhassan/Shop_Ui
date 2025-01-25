package pages;
import org.openqa.selenium.*;

public class p02_Ladies_Outerwear
{
     WebDriver driver;
    //1-constructor
    public p02_Ladies_Outerwear(WebDriver driver)
    {
        this.driver=driver;
    }
    //2-locators
    WebDriver shadowHost= (WebDriver) driver.findElement(By.cssSelector(""));//how to find the host .
    JavascriptExecutor js=(JavascriptExecutor) driver;
    WebElement shadowRoot=(WebElement) js.executeScript("return argument[0].shadowRoot",shadowHost);
    WebElement image_women_outerwear=shadowRoot.findElement(By.cssSelector("*[src='data/images/10-24099B.jpg']"));
    // WebElement image_women_outerwear=driver.findElement(By.xpath("//*[@src='data/images/10-24099B.jpg']"));


    //3-methods
    public p03_Add_To_Card click_image_women_outerwear()
    {
      image_women_outerwear.sendKeys(Keys.ENTER);//shadow
      return new p03_Add_To_Card(driver);

    }


}
