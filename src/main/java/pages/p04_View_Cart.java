package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p04_View_Cart
{
     WebDriver driver;
    //1-constructor
    public p04_View_Cart(WebDriver driver)
    {
        this.driver=driver;
    }
    //2-locators

     WebElement check_out=driver.findElement(By.xpath("//*[text()='Checkout']"));//

    //3-methods
    public p05_Check_out click_Ladies_Outerwear()
    {
       check_out.submit();
       return new p05_Check_out(driver);

    }


}
