package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driversetup
{
       public static String url="https://www.goindigo.in/";
       WebDriver driver;
       public WebDriver setUp()
       {
              System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.navigate().to(driversetup.url);
              return driver;
              
       }
}
