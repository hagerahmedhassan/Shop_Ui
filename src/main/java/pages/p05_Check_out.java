package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class p05_Check_out
{
     WebDriver driver;



    //1-constructor
    public p05_Check_out(WebDriver driver)
    {
        this.driver=driver;
    }
    //2-locators

     WebElement  email       =driver.findElement(By.id("accountEmail ")); //By.xpath("//input[type()='email']")
     WebElement  phone_number=driver.findElement(By.id("accountPhone"));
     WebElement  address     =driver.findElement(By.id("shipAddress"));
     WebElement  city        =driver.findElement(By.id("shipCity"));
     WebElement  shipState   =driver.findElement(By.id("shipState"));
     WebElement  shipZip     =driver.findElement(By.id("shipZip"));
     WebElement  ccName      =driver.findElement(By.id("ccName"));
     WebElement  ccNumber    =driver.findElement(By.id("ccNumber"));
     WebElement  placeOrder  =driver.findElement(By.cssSelector("[value='Place Order']"));
     WebElement  country_list=driver.findElement(By.id("shipCountry"));
     WebElement month        =driver.findElement(By.id("ccExpMonth"));
     WebElement ccExpYear    =driver.findElement(By.id("ccExpYear"));
     WebElement cvv          =driver.findElement(By.id("ccCVV"));
     Select select_country   =new Select(country_list);
     Select select_month     =new Select(month);
     Select select_year      =new Select(ccExpYear);
     WebElement checkBox     =driver.findElement(By.id("setBilling"));
     WebElement billAddress  =driver.findElement(By.xpath("//input[@id='billAddress']"));
     WebElement billCity     =driver.findElement(By.id("billCity"));
     WebElement billState    =driver.findElement(By.id("billState"));
     WebElement billZip      =driver.findElement(By.id("billZip"));
     WebElement billCountryList=driver.findElement(By.id("billCountry"));
     Select selectBillCountry  =new Select(billCountryList);






    //3-methods
    public void full_Data()
    {
      email       .sendKeys("uj8u93+fzc0qog@guerrillamail.com");//guerrilla mail ,fake email,Temp Mail,10 Minute Mail,Mailinator,Tempail
      phone_number.sendKeys("13132005402");//Receive SMS Online,FreePhoneNum,SMS-Activate,Twilio,TextNow.
      address     .sendKeys("1 cairo street");
      city        .sendKeys("cairo");
      shipState   .sendKeys("cairo");
      shipZip     .sendKeys("2345");
      ccName      .sendKeys("credit card");
      ccNumber    .sendKeys("3241");
      cvv         .sendKeys("124");
      select_country.selectByVisibleText("Canada");
          //select_country.selectByValue("CA");
          //select_country.selectByIndex(1);
        select_month.selectByVisibleText("Apr");
        select_year.selectByValue("2020");
        if (checkBox.isSelected())
        {
            checkBox.click();
            billAddress      .sendKeys("America");
            billCity         .sendKeys("los angeles");
            billState        .sendKeys("california");
            billZip          .sendKeys("2345");
            selectBillCountry.selectByIndex(0);

        }
      placeOrder  .click();//submit


    }


}
