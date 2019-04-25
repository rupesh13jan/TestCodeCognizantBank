package steps;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class stepDefinition
{

	WebDriver driver;
	
	
	@Given("^a User$")
	public void a_User() throws Throwable {
	}

	@When("^hit the cognizant bank url$")
	public void hit_the_cognizant_bank_url() throws Throwable {
		driver=new ChromeDriver();
		driver.get("http://localhost:8004/CognizantBanking/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Then("^cognizant bank home page should get open$")
	public void cognizant_bank_home_page_should_get_open() throws Throwable {
	String title =driver.getTitle();
	//Assert.assertEquals("Global Banking ..", title);
	}

	@Then("^clicks on new account$")
	public void clicks_on_new_account() throws Throwable {
	
		WebElement elementNewAccount=driver.findElement(By.xpath("//*[@href='create.html']"));
		elementNewAccount.click();
		
	}

	@Then("^new account page should be displayed$")
	public void new_account_page_should_be_displayed() throws Throwable {
	
		WebElement elementNewAccountVerification=driver.findElement(By.xpath("//*[.='APANA - BANK']"));
		String textApana=elementNewAccountVerification.getText();
		//Assert.assertEquals(textApana, "APANA - BANK");
		Thread.sleep(3000);
		driver.quit();
	
	}

	@Given("^driver path$")
	public void driver_path() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	}
}
