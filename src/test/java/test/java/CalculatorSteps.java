package test.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CalculatorSteps  extends TestCase {
public WebDriver driver;
	
	@Given("^user open \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void user_open_and_select(String browser, String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver-v0.17.0-win64/geckodriver.exe");
		if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get(url);
	    //throw new PendingException();
	}

	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int firstVal, int secondVal) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException()
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(5));		
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(4));
		
	}

	@Given("^Select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		if(arg1.equals("Mul"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
		else
		{
			driver.findElement(By.id("gwt-uid-1")).click();	
		}
		
	}

	@When("^Click on Calculate$")
	public void click_on_Calculate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^Result should be (\\d+)$")
	public void result_should_be(int value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		String result= driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(value, Integer.parseInt(result));
		driver.quit();
}

}