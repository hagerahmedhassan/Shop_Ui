import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import netscape.javascript.JSException;
import pages.p01_Home_Page;
import pages.p02_Ladies_Outerwear;

import java.util.concurrent.TimeUnit;

public class TestCase
{
    WebDriver driver=new ChromeDriver();

    @BeforeTest
    public void set_up()
    {
        driver.manage().window().fullscreen();
        driver.navigate().to("https://shop.polymer-project.org/");
        //driver.get("https://shop.polymer-project.org/");
         //implicitwait dynamic
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }
    @Test
    public void tests() throws InterruptedException
    {
        p02_Ladies_Outerwear homePage = new p01_Home_Page(driver).click_Ladies_Outerwear();
    }
    @AfterTest
    public void clean_up()
    {
        driver.quit();//close all taps
    }

}
