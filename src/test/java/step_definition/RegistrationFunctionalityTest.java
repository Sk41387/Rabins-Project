package step_definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Main;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFunctionalityTest extends Main{
	String registrationPageURL = "http://demo.guru99.com/test/newtours/register.php";
	
	@Given("user is in registration page")
	public void user_is_in_registration_page() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getCurrentUrl(), registrationPageURL);
	}

	@When("user provides username, password and confirm password")
	public void user_provides_username_password_and_confirm_password() {
		driver.findElement(By.name("email")).sendKeys("tom123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("confirmPassword")).sendKeys("123");
	}
	
//	@And ("user clicks submit button in registration page")
//	public void user_clicks_submit_button_in_registration_page() {
//		driver.findElement(By.name("submit")).click();
//	}

	@Then("user should be able to register to the application")
	public void user_should_be_able_to_register_to_the_application() {
		WebElement registerationSuccessMsg = driver.findElement(By.
				xpath("//table[@width='492']/tbody/tr[3]/td/p[3]"));
		Assert.assertTrue(registerationSuccessMsg.isDisplayed());
	}
	
	// from Tidy Gherkin
//	@When("^user provides (.+), (.+) and (.+)$")
//	public void user_provides_and(String username, String password, String confirmpassword) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
//	}
	
	// snippets
	@When("user provides <username>, <password> and <confirmPassword>")
	public void user_provides_username_password_and_confirm_password(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		
		driver.findElement(By.name("email")).sendKeys(data.get(0).toString());
		driver.findElement(By.name("password")).sendKeys(data.get(1).toString());
		driver.findElement(By.name("confirmPassword")).sendKeys(data.get(2).toString());
	}
	
	@When("user clicks register link")
	public void user_clicks_register_link() {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Then("user should land in registration page")
	public void user_should_land_in_registration_page() {
		Assert.assertEquals(driver.getCurrentUrl(), registrationPageURL);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
