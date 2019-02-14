package steps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchItem extends driversetup
{
       WebDriver driver;
       
@BeforeMethod
public void set() throws InterruptedException
{
       driver=setUp();
       Thread.sleep(10000);
}

@Test(priority=1)
public void excelSet() throws Exception
{
	WebDriverWait wait=new WebDriverWait(driver,30);
       excelutils.setpath();
       HashMap<String,String> hm=new HashMap<String,String>();
       hm=excelutils.getCell();
       Iterator<String> it=hm.keySet().iterator();
       String from="";
       String to="";
       while(it.hasNext())
       {
    	   from=it.next();
    	   to=hm.get(from);
       WebElement ele=driver.findElement(By.xpath("//*[@name='or-src']"));
       ele.click();
       ele.sendKeys("");
       ele.sendKeys(from,Keys.ENTER);
       Thread.sleep(1000);
       ele=driver.findElement(By.xpath("//*[@name='or-dest']"));
       ele.click();
       ele.sendKeys(to,Keys.ENTER);
       Thread.sleep(2000);
       ele=driver.findElement(By.xpath("//a[contains(text(),'13')][1]"));
       ele.click();
       Thread.sleep(2000);
       ele=driver.findElement(By.xpath("//*[@class='pax-plus btn btn-info'][1]"));
       ele.click();
       Thread.sleep(2000);
       ele=driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[4]/div[1]/div[2]/div/button"));
       Actions actions = new Actions(driver);

       actions.moveToElement(ele).click().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@class='btn btn-primary block bold ig-search-btn ig-common-cta addLoader']")).click();
       ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Non-stop')][1]")));
       ele.click();
       //driver.findElement(By.xpath("")).click();
       List<WebElement> l=new ArrayList<WebElement>();
       l.addAll(driver.findElements(By.xpath("//*[@class='col gutter flight-detail col-6']")));
       int count=0;
       System.out.println("From: "+from+" to: "+to);
       for(int i=0;i<l.size();i++)
       {
    	   if(count<10)
    	   {
    		   System.out.println(l.get(i).getText());
    	   }
    	   count++;
       }
       System.out.println("***************************************");
       driver.get("https://www.goindigo.in/");
       }
}

@AfterMethod
public void driverQuit()
{
       driver.quit();
} 
}
