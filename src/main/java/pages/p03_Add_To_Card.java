package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p03_Add_To_Card
{
     WebDriver driver;
    WebDriverWait wait=new WebDriverWait(driver,10);

    //1-constructor
    public p03_Add_To_Card(WebDriver driver)
    {
        this.driver=driver;
    }
    //2-locators
    WebElement addToCart=driver.findElement(By.linkText("Add to Cart"));//*[text()='Add to Cart'] //xpath

    //WebElement checkOut=driver.findElement(By.linkText("Checkout"));
    // WebElement verify_cart=driver.findElement(By.linkText("View Cart"));


    //3-methods

    public p04_View_Cart click_Ladies_Outerwear()
    {

        addToCart.submit();
        WebElement verify_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Cart")));
        WebElement checkOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Checkout")));
        //check verify cart or check out
        if (verify_cart.isSelected()) {
            verify_cart.click();
            return new p04_View_Cart(driver);
        }
        // return new p04_View_Cart(driver);

        else if (checkOut.isSelected()) {
            checkOut.click();
        }
        return new p05_Check_out(driver);


    }

}
