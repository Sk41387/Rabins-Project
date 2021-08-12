package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityTest extends Main{

	@Given("registered user is in homepage")
	public void registered_user_is_in_homepage() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/test/newtours/index.php");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
	}

	@And("user clicks submit button")
	public void user_clicks_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		WebElement actualSuccessfulLoginMsg = driver.findElement(By.
				xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		Assert.assertTrue(actualSuccessfulLoginMsg.isDisplayed());
	}
	
	@And("user is hitting enter key")
	public void user_is_hitting_enter_key() {
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
	}
	
	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("tom123456");
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='password']/following-sibling::span"))
				.isDisplayed());
	}
	
	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {
		driver.findElement(By.name("userName")).sendKeys("john12345");
		driver.findElement(By.name("password")).sendKeys("123");
	}
	
	// adding some scripts
	
	
	
	
	
}
